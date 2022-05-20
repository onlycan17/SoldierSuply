import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import util.Excel;
import 행정.재산대장;
import 행정.재산대장_소모품;
import 행정.재산대장_장구류;
import 행정.재산대장_피복류;

public class Main {

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    Excel excel = new Excel();
    List<재산대장> 장구류들 = main.장구류_주입();
    List<재산대장> 소모품들 = main.소모품_주입();
    List<재산대장> 피복류들 = main.피복류_주입();
    main.writeCSV(장구류들,"장구류재산대장");
    main.writeCSV(소모품들, "소모품재산대장");
    main.writeCSV(피복류들,"피복류재산대장");

    excel.writeExcel(장구류들,"장구류재산대장");
    excel.writeExcel(소모품들,"소모품재산대장");
    excel.writeExcel(피복류들,"피복류재산대장");
  }

  public void writeCSV(List<재산대장> dataList,String fileName) throws IOException {
    File csv = new File(".");
    String localFile = csv.getAbsolutePath();
    String fileLocation = localFile.substring(0, localFile.length() - 1) + fileName + ".csv";

    //String temp = System.getProperty("user.home")+"/Documents";
    //File csv = new File(temp,fileLocation);

    BufferedWriter bw = null; // 출력 스트림 생성
    try {
      bw = new BufferedWriter(new FileWriter(fileLocation));
      // csv파일의 기존 값에 이어쓰려면 위처럼 true를 지정하고, 기존 값을 덮어쓰려면 true를 삭제한다

      for (int i = 0; i < dataList.size(); i++) {

        String aData = "";
        aData = i+1+","+dataList.get(i).get품명() + "," + dataList.get(i).get입고량() + "," + dataList.get(i).get입고일자() + "," + dataList.get(i).get출고량()+","+dataList.get(i).get출고일자()+","+dataList.get(i).get합계()+","+dataList.get(i).get비고();
        // 한 줄에 넣을 각 데이터 사이에 ,를 넣는다
        bw.write(aData);
        // 작성한 데이터를 파일에 넣는다
        bw.newLine(); // 개행
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bw != null) {
          bw.flush(); // 남아있는 데이터까지 보내 준다
          bw.close(); // 사용한 BufferedWriter를 닫아 준다
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }


  public List<재산대장> 장구류_주입(){
    List<재산대장> 수통List = new ArrayList<>();
    List<재산대장> 헬멧List = new ArrayList<>();
    List<재산대장> 방탄조끼List = new ArrayList<>();
    List<재산대장> 재산대장List = new ArrayList<>();


    수통List.add(new 재산대장_장구류().수령("수통", 2050,2050, LocalDate.of(2022, 01, 20), "초기 수령"));
    헬멧List.add(new 재산대장_장구류().수령("헬멧", 2000,2000, LocalDate.of(2022, 01, 20), "초기 수령"));
    방탄조끼List.add(new 재산대장_장구류().수령("방탄조끼", 2100,2100, LocalDate.of(2022, 01, 20), "초기 수령"));

    for (int i = 0; i < 2000; i++) {
      double itemName = Math.random();
      double itemStatus = Math.random();
      double countdouble = Math.random();

      if((int)(itemName * 3)+1 == 1){
        if((int)(itemStatus * 2)+1 == 1){
           int ea = (int)((countdouble*100)+1);
          수통List.add(new 재산대장_장구류().수령("수통",ea, ea+수통List.get(수통List.size()-1).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = ((int)(countdouble*100)+1);
          수통List.add(new 재산대장_장구류().반품("수통",ea, 수통List.get(수통List.size()-1).get합계() - ea,LocalDate.now(),"반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("수통",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      } else if ((int)(itemName *3)+1 ==2) {
        if((int)(itemStatus * 2)+1 == 1){
          int ea = ((int)(countdouble*100)+1);
          헬멧List.add(new 재산대장_장구류().수령("헬멧", ea,ea+헬멧List.get(헬멧List.size()-1).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = ((int)(countdouble*100)+1);
          헬멧List.add(new 재산대장_장구류().반품("헬멧", ea,헬멧List.get(헬멧List.size()-1).get합계()-ea,LocalDate.now(),"반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("헬멧",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      }else {
        if((int)(itemStatus * 2)+1 == 1){
          int ea = ((int)(countdouble*100)+1);
          방탄조끼List.add(new 재산대장_장구류().수령("방탄조끼", ea,ea+방탄조끼List.get(방탄조끼List.size()-1).get합계(),LocalDate.now(),"수령"));
        }else {
          int ea = ((int)(countdouble*100)+1);
          방탄조끼List.add(new 재산대장_장구류().반품("방탄조끼", ea,방탄조끼List.get(방탄조끼List.size()-1).get합계()-ea,LocalDate.now(),"반납"));
        }
        //재산대장List.add(new 재산대장_장구류().수리("방탄조끼",재산대장List.get(i).get합계(), LocalDate.of(2022, 02, 04), "정비"));
      }
    }
    재산대장List.addAll(수통List);
    재산대장List.addAll(헬멧List);
    재산대장List.addAll(방탄조끼List);
    return 재산대장List;
  }

  public List<재산대장> 소모품_주입(){
    List<재산대장> 소모품들 = new ArrayList<>();

    for(int i=0;i<2000;i++){
      double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      소모품들.add(new 재산대장_소모품().불출("휴지",2000, LocalDate.of((int)(year*2022)+1,(int)(month*12)+1,(int)day*31+1), "수령(불출)"));
      소모품들.add(new 재산대장_소모품().불출("비누",2100, LocalDate.of((int)(year*2022)+1,(int)(month*12)+1,(int)day*31+1), "수령(불출)"));
      소모품들.add(new 재산대장_소모품().소모("휴지", 2000, LocalDate.of((int)(year*2022)+1,(int)(month*12)+1,(int)day*31+1), "모두 소모"));
      소모품들.add(new 재산대장_소모품().소모("비누", 2100, LocalDate.of((int)(year*2022)+1,(int)(month*12)+1,(int)day*31+1), "모두 소모"));
    }

    return 소모품들;
  }

  public List<재산대장> 피복류_주입(){
    List<재산대장> 피복류들 = new ArrayList<>();
    피복류들.add(new 재산대장_피복류().전입("생활복",300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입("슬리퍼",300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입("전투복",300,300,LocalDate.of(1999,01,01),"초기전입"));
    피복류들.add(new 재산대장_피복류().전입("전투화",300,300,LocalDate.of(1999,01,01),"초기전입"));
    for(int i =0; i < 2000; i++){
      double year = Math.random();
      double month = Math.random();
      double day = Math.random();
      double status = Math.random();
      double ea = Math.random();
      if((int) (status*3)+1 == 1) {
        피복류들.add(
            new 재산대장_피복류().전입("생활복", (int) (ea * 5) + 1, (int) (ea * 5 )+ 1 + 피복류들.get(i).get합계(),
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

      } else if ((int)(status*3)+1 == 2) {
        피복류들.add(
            new 재산대장_피복류().전출("생활복", (int) (ea * 5) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("슬리퍼", (int) (ea * 5) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("전투화", (int) (ea * 10) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
        피복류들.add(
            new 재산대장_피복류().전출("전투복", (int) (ea * 10) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "타부대 전출"));
      } else {
        피복류들.add(
            new 재산대장_피복류().전역("생활복", (int) (ea * 5) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("슬리퍼", (int) (ea * 5) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("전투화", (int) (ea * 10) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
        피복류들.add(
            new 재산대장_피복류().전역("전투복", (int) (ea * 10) + 1,피복류들.get(i).get합계() - ((int) (ea * 5) + 1),
                LocalDate.of(2022, (int) (month * 9) + 3, (int) (day * 30) + 1),
                "전역"));
      }

    }
    return 피복류들;
  }

}
