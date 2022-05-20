package 장소.창고;

import java.util.List;
import 보급품목.식량1종.건빵;
import 보급품목.식량1종.라면;
import 보급품목.식량1종.맛스타;
import 보급품목.식량1종.전투식량;
import 보급품목.식량1종.초코파이;
import 보급품목.식량1종.특전식량;

public final class 대대특식창고Builder {

  private List<건빵> 건빵들;
  private List<초코파이> 초코파이들;
  private List<라면> 라면들;
  private List<맛스타> 맛스타들;
  private List<보급품목.식량1종.전투식량> 전투식량;
  private List<보급품목.식량1종.특전식량> 특전식량;

  private 대대특식창고Builder() {
  }

  public static 대대특식창고Builder a대대특식창고() {
    return new 대대특식창고Builder();
  }

  public 대대특식창고Builder with건빵들(List<건빵> 건빵들) {
    this.건빵들 = 건빵들;
    return this;
  }

  public 대대특식창고Builder with초코파이들(List<초코파이> 초코파이들) {
    this.초코파이들 = 초코파이들;
    return this;
  }

  public 대대특식창고Builder with라면들(List<라면> 라면들) {
    this.라면들 = 라면들;
    return this;
  }

  public 대대특식창고Builder with맛스타들(List<맛스타> 맛스타들) {
    this.맛스타들 = 맛스타들;
    return this;
  }

  public 대대특식창고Builder with전투식량(List<전투식량> 전투식량) {
    this.전투식량 = 전투식량;
    return this;
  }

  public 대대특식창고Builder with특전식량(List<특전식량> 특전식량) {
    this.특전식량 = 특전식량;
    return this;
  }

  public 대대특식창고 build() {
    대대특식창고 대대특식창고 = new 대대특식창고();
    대대특식창고.set건빵들(건빵들);
    대대특식창고.set초코파이들(초코파이들);
    대대특식창고.set라면들(라면들);
    대대특식창고.set맛스타들(맛스타들);
    대대특식창고.set전투식량(전투식량);
    대대특식창고.set특전식량(특전식량);
    return 대대특식창고;
  }
}
