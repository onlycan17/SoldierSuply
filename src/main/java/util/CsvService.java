package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import 행정.재산대장;

public class CsvService {

  public void downloadCSV(List<재산대장> dataList, String fileName) {
    File csv = new File(".");
    String localFile = csv.getAbsolutePath();
    String fileLocation = localFile.substring(0, localFile.length() - 1) + fileName + ".csv";

    //BufferedWriter bw = null;
    try (BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(fileLocation),
            StandardCharsets.UTF_8))) {
      //bw = new BufferedWriter(new FileWriter(fileLocation)); //기존값 덮어쓰기
      bw.write("\uFEFF");
      List<String> headers = List.of("번호", "품명", "입고량", "입고일자", "출고량", "출고일자", "합계", "비고");
      for (String header : headers) {
        bw.write(header);
        bw.write(",");
      }

      bw.newLine();

      for (int i = 0; i < dataList.size(); i++) {
        String aData;
        aData = i + 1 + ","
            + dataList.get(i).get품명()
            + "," + dataList.get(i).get입고량()
            + "," + dataList.get(i).get입고일자()
            + "," + dataList.get(i).get출고량()
            + "," + dataList.get(i).get출고일자()
            + "," + dataList.get(i).get합계()
            + "," + dataList.get(i).get비고();
        // 한 줄에 넣을 각 데이터 사이에 ,를 넣는다
        bw.write(aData);
        // 작성한 데이터를 파일에 넣는다
        bw.newLine(); // 개행
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
