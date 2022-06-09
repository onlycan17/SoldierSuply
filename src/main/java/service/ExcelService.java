package service;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExcelService implements IService{

  ReflectionService reflectionService;
  public ExcelService() {
    this.reflectionService = new ReflectionService();
  }

  @Override
  public <T> void download(List<T> dataList, String fileName) {
    XSSFSheet sheet;
    XSSFRow headerRow;
    XSSFRow row;

    //List<String> headers = List.of("번호","품명","입고량","입고일자","출고량","출고일자","합계","비고");

    Field[] fieldsTitle = reflectionService.getSortReflectionTitle(dataList.get(0));
    List<String> title = new ArrayList<>();
    title.add("번호");
    for (Field field : fieldsTitle) {
      title.add(field.getName());
    }

    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path filePath = Paths.get(currentPath.toString(), fileName+".xlsx");
    try(XSSFWorkbook xworkbook = new XSSFWorkbook();
        FileOutputStream fos = new FileOutputStream(filePath.toString())) {
      sheet = xworkbook.createSheet("재산대장");
      int rowNo = 0;
      headerRow = sheet.createRow(rowNo++);
      for (int i = 0; i < title.size(); i++) {
        headerRow.createCell(i).setCellValue(title.get(i));
      }

      for (int i = 0; i < dataList.size(); i++) {
        Field[] fields = reflectionService.getSortReflectionItem(dataList,i);

        int idxCell = 0;
        row = sheet.createRow(rowNo++);
        row.createCell(idxCell).setCellValue(rowNo-1);
        for (Field field : fields) {
          row.createCell(idxCell += 1).setCellValue(field.get(dataList.get(i)) == null ? "" : field.get(dataList.get(i)) + "");
        }
      }

      xworkbook.write(fos);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
