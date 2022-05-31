package 행정;

import java.time.LocalDate;
import java.util.StringJoiner;
import 검사결과.합격불합격여부;

public class 재산대장_피복류 extends 재산대장{
  private LocalDate 입고일자;
  private int 입고량;
  private String 품명;
  private 합격불합격여부 검사결과;
  private LocalDate 출고일자;
  private int 출고량;

  private int 합계;
  private String 비고;

  public int get합계() {
    return 합계;
  }

  @Override
  public 재산대장_피복류 전입(String 품명, int 입고수량, int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    입고일자 = date;
    입고량 = 입고수량;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }

  @Override
  public 재산대장_피복류 전출(String 품명, int 출고수량, int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    출고일자 = date;
    출고량 = 출고수량;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }

  @Override
  public 재산대장_피복류 전역(String 품명, int 출고수량, int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    출고일자 = date;
    출고량 = 출고수량;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }

  @Override
  public 재산대장_피복류 수리(String 품명,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.비고 = 비고+date;
    return this;
  }

  @Override
  public 재산대장_피복류 손망실처리(String 품명, int 출고수량, int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    출고일자 = date;
    this.합계 = 합계;
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
  //  public 재산대장_피복류 전입(I피복류 품명,int 입고수량,int 합계, LocalDate date, String 비고){
//    피복류 = 품명;
//    입고일자 = date;
//    입고량 = 입고수량;
//    this.합계 = 합계;
//    this.비고 = 비고;
//    return this;
//  }
//
//  public 재산대장_피복류 전출(I피복류 품명, int 출고수량, int 합계, LocalDate date, String 비고){
//    피복류 = 품명;
//    출고일자 = date;
//    출고량 = 출고수량;
//    this.합계 = 합계;
//    this.비고 = 비고;
//    return this;
//  }
//
//  public 재산대장_피복류 전역(I피복류 품명, int 출고수량, int 합계, LocalDate date, String 비고){
//    피복류 = 품명;
//    출고일자 = date;
//    출고량 = 출고수량;
//    this.합계 = 합계;
//    this.비고 = 비고;
//    return this;
//  }
//
//  public 재산대장_피복류 수리(I피복류 품명,LocalDate date, String 비고){
//    피복류 = 품명;
//    this.비고 = 비고+date;
//    return this;
//  }
//
//  public 재산대장_피복류 손망실처리(I피복류 품명, int 출고수량, int 합계, LocalDate date, String 비고){
//    피복류 = 품명;
//    출고일자 = date;
//    this.합계 = 합계;
//    this.비고 = 비고;
//    return this;
//  }
}
