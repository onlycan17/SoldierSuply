package 행정;

import java.time.LocalDate;
import java.util.StringJoiner;
import 검사결과.합격불합격여부;

public class 재산대장_소모품 extends 재산대장 {

  @ModelOrder(order = 3)
  private LocalDate 입고일자;
  @ModelOrder(order = 2)
  private int 입고량;

  @ModelOrder(order = 1)
  private String 품명;

  @ModelOrder(order = 5)
  private LocalDate 출고일자;

  @ModelOrder(order = 4)
  private int 출고량;

  @ModelOrder(order = 7)
  private String 비고;
  @ModelOrder(order = 6)
  private int 합계;

  @Override
  public 재산대장_소모품 불출(String 품명, int 입고수량,  LocalDate date, String 비고) {
    this.품명 = 품명;
    입고일자 = date;
    입고량 = 입고수량;
    this.비고 = 비고;
    return this;
  }

  @Override
  public 재산대장_소모품 소모(String 품명, int 출고수량, LocalDate date, String 비고) {
    this.품명 = 품명;
    출고일자 = date;
    출고량 = 출고수량;
    this.비고 = 비고;
    return this;
  }

  @Override
  public 재산대장_소모품 수리(String 품명,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.비고 = 비고+date;
    return this;
  }

  @Override
  public 재산대장_소모품 손망실처리(String 품명, int 출고수량, int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    출고일자 = date;
    this.비고 = 비고;
    return this;
  }
  public String toString(int i) {
    return new StringJoiner(", ")
        .add("" + i)
        .add("" + 품명)
        .add("" + 입고량)
        .add("" + 입고일자)
        .add("" + 출고량)
        .add("" + 출고일자)
        .add("" + 합계)
        .add("" + 비고)
        .toString();
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
