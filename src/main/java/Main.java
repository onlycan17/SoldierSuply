import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import util.CsvService;
import util.ExcelService;
import 행정.재산대장;
import 행정.재산대장_소모품;
import 행정.재산대장_장구류;
import 행정.재산대장_피복류;

public class Main {

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    ExcelService excelService = new ExcelService();
    CsvService csvService = new CsvService();
    List<재산대장> 장구류들 = main.장구류_주입();
    List<재산대장> 소모품들 = main.소모품_주입();
    List<재산대장> 피복류들 = main.피복류_주입();

    csvService.downloadCSV(장구류들,"장구류재산대장");
    csvService.downloadCSV(소모품들,"소모품재산대장");
    csvService.downloadCSV(피복류들,"피복류재산대장");

    excelService.downloadExcel(장구류들, "장구류재산대장");
    excelService.downloadExcel(소모품들, "소모품재산대장");
    excelService.downloadExcel(피복류들, "피복류재산대장");
  }

  public List<재산대장> 장구류_주입() {
    List<재산대장> 수통List = new ArrayList<>();
    List<재산대장> 헬멧List = new ArrayList<>();
    List<재산대장> 방탄조끼List = new ArrayList<>();
    List<재산대장> 재산대장List = new ArrayList<>();

    수통List.add(new 재산대장_장구류().수령("수통", 2050, 2050, LocalDate.of(2022, 01, 20), "초기 수령"));
    헬멧List.add(new 재산대장_장구류().수령("헬멧", 2000, 2000, LocalDate.of(2022, 01, 20), "초기 수령"));
    방탄조끼List.add(new 재산대장_장구류().수령("방탄조끼", 2100, 2100, LocalDate.of(2022, 01, 20), "초기 수령"));

    for (int i = 0; i < 2000; i++) {
      double itemName = Math.random();
      double itemStatus = Math.random();
      double countdouble = Math.random();

      if ((int) (itemName * 3) + 1 == 1) {
        if ((int) (itemStatus * 2) + 1 == 1) {
          int ea = (int) ((countdouble * 100) + 1);
          수통List.add(new 재산대장_장구류().수령("수통", ea, ea + 수통List.get(수통List.size() - 1).get합계(),
              LocalDate.now(), "수령"));
        } else {
          int ea = ((int) (countdouble * 100) + 1);
          수통List.add(new 재산대장_장구류().반품("수통", ea, 수통List.get(수통List.size() - 1).get합계() - ea,
              LocalDate.now(), "반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("수통",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      } else if ((int) (itemName * 3) + 1 == 2) {
        int ea = ((int) (countdouble * 100) + 1);
        if ((int) (itemStatus * 2) + 1 == 1) {
          헬멧List.add(new 재산대장_장구류().수령("헬멧", ea, ea + 헬멧List.get(헬멧List.size() - 1).get합계(),
              LocalDate.now(), "수령"));
        } else {
          헬멧List.add(new 재산대장_장구류().반품("헬멧", ea, 헬멧List.get(헬멧List.size() - 1).get합계() - ea,
              LocalDate.now(), "반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("헬멧",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      } else {
        int ea = ((int) (countdouble * 100) + 1);
        if ((int) (itemStatus * 2) + 1 == 1) {
          방탄조끼List.add(new 재산대장_장구류().수령("방탄조끼", ea, ea + 방탄조끼List.get(방탄조끼List.size() - 1).get합계(),
              LocalDate.now(), "수령"));
        } else {
          방탄조끼List.add(new 재산대장_장구류().반품("방탄조끼", ea, 방탄조끼List.get(방탄조끼List.size() - 1).get합계() - ea,
              LocalDate.now(), "반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("방탄조끼",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      }
    }
    재산대장List.addAll(수통List);
    재산대장List.addAll(헬멧List);
    재산대장List.addAll(방탄조끼List);
    return 재산대장List;
  }

  public List<재산대장> 소모품_주입() {
    List<재산대장> 소모품들 = new ArrayList<>();

    for (int i = 0; i < 2000; i++) {
      double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      소모품들.add(new 재산대장_소모품().불출("휴지", 2000,
          LocalDate.of((int) (year * 2022) + 1, (int) (month * 8) + 3, (int) (day * 30) + 1),
          "수령(불출)"));
      소모품들.add(new 재산대장_소모품().불출("비누", 2100,
          LocalDate.of((int) (year * 2022) + 1, (int) (month * 8) + 3, (int) (day * 30) + 1),
          "수령(불출)"));
      소모품들.add(new 재산대장_소모품().소모("휴지", 2000,
          LocalDate.of((int) (year * 2022) + 1, (int) (month * 8) + 3, (int) (day * 30) + 1),
          "모두 소모"));
      소모품들.add(new 재산대장_소모품().소모("비누", 2100,
          LocalDate.of((int) (year * 2022) + 1, (int) (month * 8) + 3, (int) (day * 30) + 1),
          "모두 소모"));
    }

    return 소모품들;
  }

  public List<재산대장> 피복류_주입() {
    List<재산대장> 피복류들 = new ArrayList<>();
    피복류들.add(new 재산대장_피복류().전입("생활복", 300, 300, LocalDate.of(1999, 01, 01), "초기전입"));
    피복류들.add(new 재산대장_피복류().전입("슬리퍼", 300, 300, LocalDate.of(1999, 01, 01), "초기전입"));
    피복류들.add(new 재산대장_피복류().전입("전투복", 300, 300, LocalDate.of(1999, 01, 01), "초기전입"));
    피복류들.add(new 재산대장_피복류().전입("전투화", 300, 300, LocalDate.of(1999, 01, 01), "초기전입"));
    for (int i = 0; i < 2000; i++) {
      //double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      double status = Math.random();
      double ea = Math.random();
      if ((int) (status * 3) + 1 == 1) {
        피복류들.add(
            new 재산대장_피복류().전입("생활복", (int) (ea * 5) + 1, (int) (ea * 5) + 1 + 피복류들.get(i).get합계(),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입("슬리퍼", (int) (ea * 5) + 1, (int) (ea * 5) + 1 + 피복류들.get(i).get합계(),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입("전투화", (int) (ea * 10) + 1, (int) (ea * 5) + 1 + 피복류들.get(i).get합계(),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입("전투복", (int) (ea * 10) + 1, (int) (ea * 5) + 1 + 피복류들.get(i).get합계(),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전입"));

      } else if ((int) (status * 3) + 1 == 2) {
        피복류들.add(
            new 재산대장_피복류().전출("생활복", (int) (ea * 5) + 1, 피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("슬리퍼", (int) (ea * 5) + 1, 피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("전투화", (int) (ea * 10) + 1,
                피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("전투복", (int) (ea * 10) + 1,
                피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
      } else {
        피복류들.add(
            new 재산대장_피복류().전역("생활복", (int) (ea * 5) + 1, 피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("슬리퍼", (int) (ea * 5) + 1, 피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("전투화", (int) (ea * 10) + 1,
                피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("전투복", (int) (ea * 10) + 1,
                피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
      }

    }
    return 피복류들;
  }

}
