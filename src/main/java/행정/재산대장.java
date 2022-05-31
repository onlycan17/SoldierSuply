package 행정;

import java.time.LocalDate;
import java.util.StringJoiner;
import 검사결과.합격불합격여부;

public abstract class 재산대장 {

  private LocalDate 입고일자;
  private int 입고량;
  private String 품명;
  private 합격불합격여부 검사결과;
  private LocalDate 출고일자;
  private int 출고량;
  private String 비고;
  private int 합계;

  public int get합계() {
    return 합계;
  }

  public LocalDate get입고일자() {
    return 입고일자;
  }

  public void set입고일자(LocalDate 입고일자) {
    this.입고일자 = 입고일자;
  }

  public int get입고량() {
    return 입고량;
  }

  public void set입고량(int 입고량) {
    this.입고량 = 입고량;
  }

  public String get품명() {
    return 품명;
  }

  public void set품명(String 품명) {
    this.품명 = 품명;
  }

  public 합격불합격여부 get검사결과() {
    return 검사결과;
  }

  public void set검사결과(합격불합격여부 검사결과) {
    this.검사결과 = 검사결과;
  }

  public LocalDate get출고일자() {
    return 출고일자;
  }

  public void set출고일자(LocalDate 출고일자) {
    this.출고일자 = 출고일자;
  }

  public int get출고량() {
    return 출고량;
  }

  public void set출고량(int 출고량) {
    this.출고량 = 출고량;
  }

  public String get비고() {
    return 비고;
  }

  public void set비고(String 비고) {
    this.비고 = 비고;
  }

  public void set합계(int 합계) {
    this.합계 = 합계;
  }

  public 재산대장 수령(String 품명, int 입고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.입고량 = 입고수량;
    this.합계 = 합계;
    this.입고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 반품(String 품명, int 출고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.출고량 = 출고수량;
    this.합계 = 합계;
    this.출고일자 = date;
    this.비고 = 비고;

    return this;
  }

  public 재산대장 불출(String 품명, int 입고수량, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.입고량 = 입고수량;
    this.입고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 소모(String 품명, int 출고수량, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.출고량 = 출고수량;
    this.출고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 전입(String 품명, int 입고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.입고량 = 입고수량;
    this.합계 = 합계;
    this.입고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 전출(String 품명, int 출고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.출고량 = 출고수량;
    this.합계 = 합계;
    this.출고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 전역(String 품명, int 출고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.출고량 = 출고수량;
    this.합계 = 합계;
    this.출고일자 = date;
    this.비고 = 비고;
    return this;
  }

  public 재산대장 수리(String 품명,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.합계 = 합계;
    this.비고 = 비고+" "+date;
    return this;
  }

  public 재산대장 손망실처리(String 품명, int 출고수량,int 합계, LocalDate date, String 비고) {
    this.품명 = 품명;
    this.출고량 = 출고수량;
    this.합계 = 합계;
    this.입고일자 = date;
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
}
