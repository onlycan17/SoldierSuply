package util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import 행정.재산대장;

public class ExcelService {

  public void downloadExcel(List<재산대장> list,String fileName){


    XSSFSheet sheet;
    XSSFRow headerRow;
    XSSFRow row;
    List<String> headers = List.of("번호","품명","입고량","입고일자","출고량","출고일자","합계","비고");
    File file = new File(".");
    String localFile = file.getAbsolutePath();
    String fileLocation = localFile.substring(0, localFile.length() - 1) + fileName + ".xlsx";
    try(XSSFWorkbook xworkbook = new XSSFWorkbook();
        FileOutputStream fos = new FileOutputStream(fileLocation)) {
      sheet = xworkbook.createSheet("재산대장");
      int rowNo = 0;
      int cellNo = 0;
      headerRow = sheet.createRow(rowNo++);
      for (String header : headers) {
          headerRow.createCell(cellNo).setCellValue(header);
          cellNo++;
      }

      for (재산대장 oneLine : list) {
        row = sheet.createRow(rowNo++);
        int idxCell = 0;
        row.createCell(idxCell++).setCellValue(rowNo-1);
        row.createCell(idxCell++).setCellValue(oneLine.get품명());
        row.createCell(idxCell++).setCellValue(oneLine.get입고량());
        row.createCell(idxCell++).setCellValue(oneLine.get입고일자() != null ? oneLine.get입고일자().toString():"");
        row.createCell(idxCell++).setCellValue(oneLine.get출고량());
        row.createCell(idxCell++).setCellValue(oneLine.get출고일자() != null ? oneLine.get출고일자().toString():"");
        row.createCell(idxCell++).setCellValue(oneLine.get합계());
        row.createCell(idxCell++).setCellValue(oneLine.get비고());
      }
      xworkbook.write(fos);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
