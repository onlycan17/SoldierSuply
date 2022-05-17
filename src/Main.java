import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import 보급품목.보급물자2종.방탄조끼;
import 보급품목.보급물자2종.비누;
import 보급품목.보급물자2종.생활복;
import 보급품목.보급물자2종.수통;
import 보급품목.보급물자2종.슬리퍼;
import 보급품목.보급물자2종.전투복;
import 보급품목.보급물자2종.전투화;
import 보급품목.보급물자2종.헬멧;
import 보급품목.보급물자2종.휴지;
import 행정.재산대장_소모품;
import 행정.재산대장_장구류;
import 행정.재산대장_피복류;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();
    List<재산대장_장구류> 장구류들 = main.장구류_주입();
    List<재산대장_소모품> 소모품들 = main.소모품_주입();
    List<재산대장_피복류> 피복류들 = main.피복류_주입();


  }
  public List<재산대장_장구류> 장구류_주입(){
    List<재산대장_장구류> 재산대장List = new ArrayList<재산대장_장구류>();

    재산대장List.add(new 재산대장_장구류().수령(new 수통(), 2050,2050, LocalDate.of(2022, 01, 20), "초기 수령"));
    재산대장List.add(new 재산대장_장구류().수령(new 헬멧(), 2000,2000, LocalDate.of(2022, 01, 20), "초기 수령"));
    재산대장List.add(new 재산대장_장구류().수령(new 방탄조끼(), 2100,2100, LocalDate.of(2022, 01, 20), "초기 수령"));

    for (int i = 0; i < 2000; i++) {
      double itemName = Math.random();
      double itemStatus = Math.random();
      double countdouble = Math.random();

      if(((int)itemName * 3)+1 == 1){
        if(((int)itemStatus * 2)+1 == 1){
           int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().수령(new 수통(),ea, ea+재산대장List.get(i).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().반품(new 수통(),ea, ea - 재산대장List.get(i).get합계(),LocalDate.now(),"반납"));
        }
        재산대장List.add(new 재산대장_장구류().수리(new 수통(), LocalDate.of(2022, 02, 04), "정비"));
      } else if (((int)itemName *3)+1 ==2) {
        if(((int)itemStatus * 2)+1 == 1){
          int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().수령(new 헬멧(), ea,ea+재산대장List.get(i).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().반품(new 헬멧(), ea,ea-재산대장List.get(i).get합계(),LocalDate.now(),"반납"));
        }
        재산대장List.add(new 재산대장_장구류().수리(new 헬멧(), LocalDate.of(2022, 02, 04), "정비"));
      }else {
        if(((int)itemStatus * 2)+1 == 1){
          int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().수령(new 방탄조끼(), ea,ea+재산대장List.get(i).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = (((int)countdouble*100)+1);
          재산대장List.add(new 재산대장_장구류().반품(new 방탄조끼(), ea,ea-재산대장List.get(i).get합계(),LocalDate.now(),"반납"));
        }
        재산대장List.add(new 재산대장_장구류().수리(new 방탄조끼(), LocalDate.of(2022, 02, 04), "정비"));
      }
    }
    return 재산대장List;
  }

  public List<재산대장_소모품> 소모품_주입(){
    List<재산대장_소모품> 소모품들 = new ArrayList<>();

    for(int i=0;i<2000;i++){
      double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      소모품들.add(new 재산대장_소모품().수령(new 휴지(),2000, LocalDate.of((int)year*2022+1,(int)month*12+1,(int)day*31+1), "수령"));
      소모품들.add(new 재산대장_소모품().수령(new 비누(),2100, LocalDate.of((int)year*2022+1,(int)month*12+1,(int)day*31+1), "수령"));
      소모품들.add(new 재산대장_소모품().소모(new 휴지(), 2000, LocalDate.of((int)year*2022+1,(int)month*12+1,(int)day*31+1), "모두 불출"));
      소모품들.add(new 재산대장_소모품().소모(new 비누(), 2100, LocalDate.of((int)year*2022+1,(int)month*12+1,(int)day*31+1), "모두 불출"));
    }

    return 소모품들;
  }

  public List<재산대장_피복류> 피복류_주입(){
    List<재산대장_피복류> 피복류들 = new ArrayList<>();
    피복류들.add(new 재산대장_피복류().전입(new 생활복(),300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입(new 슬리퍼(),300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입(new 전투복(),300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입(new 전투화(),300,300,LocalDate.of(1999,01,01),"초기전입"));
    for(int i =0; i < 2000; i++){
      double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      double status = Math.random();
      double ea = Math.random();
      if((int) status*3+1 == 1) {
        피복류들.add(
            new 재산대장_피복류().전입(new 생활복(), (int) ea * 5 + 1, (int) ea * 5 + 1 + 피복류들.get(i).get합계(),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입(new 슬리퍼(), (int) ea * 5 + 1, (int) ea * 5 + 1 + 피복류들.get(i).get합계(),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입(new 전투화(), (int) ea * 10 + 1, (int) ea * 5 + 1 + 피복류들.get(i).get합계(),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전입"));
        피복류들.add(
            new 재산대장_피복류().전입(new 전투복(), (int) ea * 10 + 1, (int) ea * 5 + 1 + 피복류들.get(i).get합계(),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전입"));

      } else if ((int) status*3+1 == 2) {
        피복류들.add(
            new 재산대장_피복류().전출(new 생활복(), (int) ea * 5 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출(new 슬리퍼(), (int) ea * 5 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출(new 전투화(), (int) ea * 10 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출(new 전투복(), (int) ea * 10 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "타부대 전출"));
      } else {
        피복류들.add(
            new 재산대장_피복류().전역(new 생활복(), (int) ea * 5 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역(new 슬리퍼(), (int) ea * 5 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역(new 전투화(), (int) ea * 10 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역(new 전투복(), (int) ea * 10 + 1,피복류들.get(i).get합계() - ((int) ea * 5 + 1),
                LocalDate.of((int) year * 2022 + 1, (int) month * 12 + 1, (int) day * 31 + 1),
                "전역"));
      }

    }
    return 피복류들;
  }

}
