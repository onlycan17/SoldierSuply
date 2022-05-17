package 행정;

import java.time.LocalDate;
import 검사결과.합격불합격여부;
import 보급품목.보급물자2종.I장구류;

abstract class 재산대장<T> {

  private LocalDate 입고일자;
  private int 입고량;
  private T 품명;
  private 합격불합격여부 검사결과;
  private LocalDate 출고일자;
  private int 출고량;
  private String 비고;
  private String 합계;

  public 재산대장 수령(T 품명, int 입고수량, LocalDate date, String 비고) {
    return null;
  }

  public 재산대장 반품(T 품명, int 출고수량, LocalDate date, String 비고) {
    return null;
  }

  public 재산대장 수리(T 품명, LocalDate date, String 비고) {
    return null;
  }

  public 재산대장 손망실처리(T 품명, int 출고수량, LocalDate date, String 비고) {
    return null;
  }
}
