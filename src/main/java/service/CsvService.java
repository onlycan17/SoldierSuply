package service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;
import org.apache.poi.util.StringUtil;

public class CsvService {

  ReflectionService reflectionService;

  public CsvService() {
    this.reflectionService = new ReflectionService();
  }

  public <T> void downloadCSV(List<T> dataList, String fileName) {
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path filePath = Paths.get(currentPath.toString(), fileName + ".csv");

    try (BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(filePath.toString()),
            StandardCharsets.UTF_8))) {
      //bw = new BufferedWriter(new FileWriter(fileLocation)); //기존값 덮어쓰기
      bw.write("\uFEFF");
      String[] headers = {"번호", "품명", "입고량", "입고일자", "출고량", "출고일자", "합계", "비고"};
      String header = StringUtil.join(",", headers);

      bw.write(header);
      bw.newLine();

      for (int i = 0; i < dataList.size(); i++) {
        int idx = 0;
        Field[] fields = reflectionService.extracted(dataList, i);
        String strOneLine = new StringJoiner(", ")
            .add("" + i)
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .add("" + fields[idx++].get(dataList.get(i)))
            .toString();
        bw.write(strOneLine);
        bw.newLine(); // 개행
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }


}