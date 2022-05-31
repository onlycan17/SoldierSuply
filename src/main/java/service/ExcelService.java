package service;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelService<T>{

  ReflectionService reflectionService;
  public ExcelService() {
    this.reflectionService = new ReflectionService();
  }

  public void downloadExcel(List<T> list,String fileName){


    XSSFSheet sheet;
    XSSFRow headerRow;
    XSSFRow row;
    List<String> headers = List.of("번호","품명","입고량","입고일자","출고량","출고일자","합계","비고");

    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path filePath = Paths.get(currentPath.toString(), fileName+".xlsx");
    try(XSSFWorkbook xworkbook = new XSSFWorkbook();
        FileOutputStream fos = new FileOutputStream(filePath.toString())) {
      sheet = xworkbook.createSheet("재산대장");
      int rowNo = 0;
      int cellNo = 0;
      headerRow = sheet.createRow(rowNo++);
      for (int i = 0; i < headers.size(); i++) {
        headerRow.createCell(i).setCellValue(headers.get(i));
      }

      for (int i = 0; i < list.size(); i++) {
        Field[] fields = reflectionService.extracted(list,i);

        int idxCell = 0;
        row = sheet.createRow(rowNo++);
        row.createCell(idxCell++).setCellValue(rowNo-1);
        for (int i1 = 0; i1 < fields.length; i1++) {
          row.createCell(idxCell++).setCellValue(fields[i1].get(list.get(i))+"");
        }
      }

      xworkbook.write(fos);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
