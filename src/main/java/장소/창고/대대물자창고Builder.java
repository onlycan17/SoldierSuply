package 장소.창고;

import java.util.List;
import 보급품목.보급물자2종.I소모품;
import 보급품목.보급물자2종.I장구류;
import 보급품목.보급물자2종.I피복류;

public final class 대대물자창고Builder {

  //본부중대 물자
  private List<I장구류> 방탄조끼들;
  private List<I장구류> 헬멧들;
  private List<I장구류> 수통들;
  private List<I피복류> 전투화들;
  private List<I피복류> 생활복들;
  private List<I소모품> 휴지들;
  private List<I소모품> 비누들;

  private 대대물자창고Builder() {
  }

  public static 대대물자창고Builder a대대물자창고() {
    return new 대대물자창고Builder();
  }

  public 대대물자창고Builder with방탄조끼들(List<I장구류> 방탄조끼들) {
    this.방탄조끼들 = 방탄조끼들;
    return this;
  }

  public 대대물자창고Builder with헬멧들(List<I장구류> 헬멧들) {
    this.헬멧들 = 헬멧들;
    return this;
  }

  public 대대물자창고Builder with수통들(List<I장구류> 수통들) {
    this.수통들 = 수통들;
    return this;
  }

  public 대대물자창고Builder with전투화들(List<I피복류> 전투화들) {
    this.전투화들 = 전투화들;
    return this;
  }

  public 대대물자창고Builder with생활복들(List<I피복류> 생활복들) {
    this.생활복들 = 생활복들;
    return this;
  }

  public 대대물자창고Builder with휴지들(List<I소모품> 휴지들) {
    this.휴지들 = 휴지들;
    return this;
  }

  public 대대물자창고Builder with비누들(List<I소모품> 비누들) {
    this.비누들 = 비누들;
    return this;
  }

  public 대대물자창고 build() {
    대대물자창고 대대물자창고 = new 대대물자창고();
    대대물자창고.set방탄조끼들(방탄조끼들);
    대대물자창고.set헬멧들(헬멧들);
    대대물자창고.set수통들(수통들);
    대대물자창고.set전투화들(전투화들);
    대대물자창고.set생활복들(생활복들);
    대대물자창고.set휴지들(휴지들);
    대대물자창고.set비누들(비누들);
    return 대대물자창고;
  }
}
