package 장소.창고;

import java.util.List;
import 보급품목.식량1종.건빵;
import 보급품목.식량1종.라면;
import 보급품목.식량1종.맛스타;
import 보급품목.식량1종.전투식량;
import 보급품목.식량1종.초코파이;
import 보급품목.식량1종.특전식량;

public class 대대특식창고 {
  private List<건빵> 건빵들;
  private List<초코파이> 초코파이들;
  private List<라면> 라면들;
  private List<맛스타> 맛스타들;
  private List<전투식량> 전투식량;
  private List<특전식량> 특전식량;

  public void set건빵들(List<건빵> 건빵들) {
    this.건빵들 = 건빵들;
  }

  public void set초코파이들(List<초코파이> 초코파이들) {
    this.초코파이들 = 초코파이들;
  }

  public void set라면들(List<라면> 라면들) {
    this.라면들 = 라면들;
  }

  public void set맛스타들(List<맛스타> 맛스타들) {
    this.맛스타들 = 맛스타들;
  }

  public void set전투식량(List<보급품목.식량1종.전투식량> 전투식량) {
    this.전투식량 = 전투식량;
  }

  public void set특전식량(List<보급품목.식량1종.특전식량> 특전식량) {
    this.특전식량 = 특전식량;
  }
}
