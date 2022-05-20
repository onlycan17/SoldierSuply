package 행정;

import java.time.LocalDate;
import 검사결과.합격불합격여부;
import 보급품목.보급물자2종.I소모품;
import 보급품목.보급물자2종.I장구류;

public class 재산대장_소모품 extends 재산대장 {

  private LocalDate 입고일자;
  private int 입고량;
  private String 소모품;
  private 합격불합격여부 검사결과;
  private LocalDate 출고일자;
  private int 출고량;
  private String 비고;

  @Override
  public 재산대장 불출(String 품명, int 입고수량,  LocalDate date, String 비고) {
    소모품 = 품명;
    입고일자 = date;
    입고량 = 입고수량;
    this.비고 = 비고;
    return super.불출(품명, 입고수량, date, 비고);
  }

  @Override
  public 재산대장 소모(String 품명, int 출고수량, LocalDate date, String 비고) {
    소모품 = 품명;
    출고일자 = date;
    출고량 = 출고수량;
    this.비고 = 비고;
    return super.소모(품명, 출고수량, date, 비고);
  }

  @Override
  public 재산대장 수리(String 품명,int 합계, LocalDate date, String 비고) {
    소모품 = 품명;
    this.비고 = 비고+date;
    return super.수리(품명,합계,date,비고);
  }

  @Override
  public 재산대장 손망실처리(String 품명, int 출고수량, int 합계, LocalDate date, String 비고) {
    소모품 = 품명;
    출고일자 = date;
    this.비고 = 비고;
    return super.손망실처리(품명, 출고수량, 합계, date, 비고);
  }

  //  public 재산대장_소모품 수령(I소모품 품명,int 입고수량, LocalDate date, String 비고){
//    소모품 = 품명;
//    입고일자 = date;
//    입고량 = 입고수량;
//    this.비고 = 비고;
//    return this;
//  }
//
//  public 재산대장_소모품 소모(I소모품 품명, int 출고수량, LocalDate date, String 비고){
//    소모품 = 품명;
//    출고일자 = date;
//    출고량 = 출고수량;
//    this.비고 = 비고;
//    return this;
//  }
//
//  public 재산대장_소모품 수리(I소모품 품명,LocalDate date, String 비고){
//    소모품 = 품명;
//    this.비고 = 비고+date;
//    return this;
//  }
//
//  public 재산대장_소모품 손망실처리(I소모품 품명, int 출고수량, LocalDate date, String 비고){
//    소모품 = 품명;
//    출고일자 = date;
//    this.비고 = 비고;
//    return this;
//  }
}
