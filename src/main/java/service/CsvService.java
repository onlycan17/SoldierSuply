package service;

import org.apache.poi.util.StringUtil;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CsvService implements IService{

  ReflectionService reflectionService;

  public CsvService() {
    this.reflectionService = new ReflectionService();
  }

  @Override
  public <T>void download(List<T> dataList, String fileName) {
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path filePath = Paths.get(currentPath.toString(), fileName + ".csv");

    try (BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(filePath.toString()),
            StandardCharsets.UTF_8))) {
      //bw = new BufferedWriter(new FileWriter(fileLocation)); //기존값 덮어쓰기
      bw.write("\uFEFF");
      //String[] headers = {"번호", "품명", "입고량", "입고일자", "출고량", "출고일자", "합계", "비고"};

      Field[] fieldsTitle = reflectionService.getSortReflectionTitle(dataList.get(0));
      List<String> title = new ArrayList<>();
      title.add("번호");
      for (Field field : fieldsTitle) {
        title.add(field.getName());
      }
      String header = StringUtil.join(",", title.toArray());

      bw.write(header);
      bw.newLine();

      for (int i = 0; i < dataList.size(); i++) {
        int idx = 0;
        Field[] fields = reflectionService.getSortReflectionItem(dataList, i);
        String strOneLine = new StringJoiner(", ")
            .add(""+(i+1))
            .add(fields[idx].get(dataList.get(i))== null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .add(fields[idx+=1].get(dataList.get(i)) == null ? "" : fields[idx].get(dataList.get(i))+"")
            .toString();
        bw.write(strOneLine);
        bw.newLine(); // 개행
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }


}
