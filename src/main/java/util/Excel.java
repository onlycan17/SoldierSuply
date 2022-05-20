package util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import 행정.재산대장;

public class Excel {

  public void writeExcel(List<재산대장> list,String fileName){

    XSSFWorkbook xworkbook;
    XSSFSheet sheet;
    XSSFRow headerRow;
    XSSFRow row;

    try {
      xworkbook = new XSSFWorkbook();
      sheet = xworkbook.createSheet("재산대장");

      int rowNo = 0;

      headerRow = sheet.createRow(rowNo++);
      headerRow.createCell(0).setCellValue("번호");
      headerRow.createCell(1).setCellValue("품명");
      headerRow.createCell(2).setCellValue("입고량");
      headerRow.createCell(3).setCellValue("입고일자");
      headerRow.createCell(4).setCellValue("출고량");
      headerRow.createCell(5).setCellValue("출고일자");
      headerRow.createCell(6).setCellValue("합계");
      headerRow.createCell(7).setCellValue("비고");

      for (재산대장 oneLine : list) {
        row = sheet.createRow(rowNo++);
        row.createCell(0).setCellValue(rowNo);
        row.createCell(1).setCellValue(oneLine.get품명());
        row.createCell(2).setCellValue(oneLine.get입고량());
        row.createCell(3).setCellValue(oneLine.get입고일자() != null ? oneLine.get입고일자().toString():"");
        row.createCell(4).setCellValue(oneLine.get출고량());
        row.createCell(5).setCellValue(oneLine.get출고일자() != null ? oneLine.get출고일자().toString():"");
        row.createCell(6).setCellValue(oneLine.get합계());
        row.createCell(7).setCellValue(oneLine.get비고());
      }

      File file = new File(".");
      String localFile = file.getAbsolutePath();
      String fileLocation = localFile.substring(0, localFile.length() - 1) + fileName + ".xlsx";
      FileOutputStream fos = null;
      fos = new FileOutputStream(fileLocation);
      xworkbook.write(fos);
      xworkbook.close();
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
