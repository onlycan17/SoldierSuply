package 행정;

import java.time.LocalDate;
import 검사결과.합격불합격여부;
import 보급품목.보급물자2종.I장구류;

public class 재산대장_장구류 extends 재산대장{


  private LocalDate 입고일자;
  private int 입고량;
  private I장구류 품명_장구류;
  private 합격불합격여부 검사결과;
  private LocalDate 출고일자;
  private int 출고량;
  private String 비고;
  private int 합계;


  public int get합계() {
    return 합계;
  }



  public 재산대장_장구류 수령(I장구류 장구류품명,int 입고수량, int 합계,LocalDate date, String 비고){
    품명_장구류 = 장구류품명;
    입고일자 = date;
    입고량 = 입고수량;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }

  public 재산대장_장구류 반품(I장구류 장구류명, int 출고수량,int 합계, LocalDate date, String 비고){
    품명_장구류 = 장구류명;
    출고일자 = date;
    출고량 = 출고수량;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }

  public 재산대장_장구류 수리(I장구류 장구류명,LocalDate date, String 비고){
    품명_장구류 = 장구류명;
    this.비고 = 비고+date;
    return this;
  }

  public 재산대장_장구류 손망실처리(I장구류 장구류명, int 출고수량, int 합계, LocalDate date, String 비고){
    품명_장구류 = 장구류명;
    출고일자 = date;
    this.합계 = 합계;
    this.비고 = 비고;
    return this;
  }


}
