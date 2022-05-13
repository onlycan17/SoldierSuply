package 장소.창고;

import java.util.List;
import 보급품목.건축자재4종.벽돌;
import 보급품목.건축자재4종.시멘트;
import 보급품목.건축자재4종.합판;
import 보급품목.보급물자2종.I소모품;
import 보급품목.보급물자2종.I장구류;
import 보급품목.보급물자2종.I피복류;

public final class 중대물자창고Builder {

  //중대 물자
  private List<I장구류> 방탄조끼들;
  private List<I장구류> 헬멧들;
  private List<I장구류> 수통들;
  private List<I피복류> 전투화들;
  private List<I피복류> 전투복들;
  private List<I피복류> 생활복들;
  private List<I소모품> 휴지들;
  private List<I소모품> 비누들;
  private List<시멘트> 시멘트들;
  private List<벽돌> 벽돌들;
  private List<합판> 합판들;

  private 중대물자창고Builder() {
  }


  public static 중대물자창고Builder a중대물자창고() {
    return new 중대물자창고Builder();
  }

  public 중대물자창고Builder with방탄조끼들(List<I장구류> 방탄조끼들) {
    this.방탄조끼들 = 방탄조끼들;
    return this;
  }

  public 중대물자창고Builder with헬멧들(List<I장구류> 헬멧들) {
    this.헬멧들 = 헬멧들;
    return this;
  }

  public 중대물자창고Builder with수통들(List<I장구류> 수통들) {
    this.수통들 = 수통들;
    return this;
  }

  public 중대물자창고Builder with전투화들(List<I피복류> 전투화들) {
    this.전투화들 = 전투화들;
    return this;
  }

  public 중대물자창고Builder with전투복들(List<I피복류> 전투복들) {
    this.전투복들 = 전투복들;
    return this;
  }

  public 중대물자창고Builder with생활복들(List<I피복류> 생활복들) {
    this.생활복들 = 생활복들;
    return this;
  }

  public 중대물자창고Builder with휴지들(List<I소모품> 휴지들) {
    this.휴지들 = 휴지들;
    return this;
  }

  public 중대물자창고Builder with비누들(List<I소모품> 비누들) {
    this.비누들 = 비누들;
    return this;
  }

  public 중대물자창고Builder with시멘트들(List<시멘트> 시멘트들) {
    this.시멘트들 = 시멘트들;
    return this;
  }

  public 중대물자창고Builder with벽돌들(List<벽돌> 벽돌들) {
    this.벽돌들 = 벽돌들;
    return this;
  }

  public 중대물자창고Builder with합판들(List<합판> 합판들) {
    this.합판들 = 합판들;
    return this;
  }

  public 중대물자창고 build() {
    중대물자창고 중대물자창고 = new 중대물자창고();
    중대물자창고.set방탄조끼들(방탄조끼들);
    중대물자창고.set헬멧들(헬멧들);
    중대물자창고.set수통들(수통들);
    중대물자창고.set전투화들(전투화들);
    중대물자창고.set생활복들(생활복들);
    중대물자창고.set휴지들(휴지들);
    중대물자창고.set비누들(비누들);
    중대물자창고.set시멘트들(시멘트들);
    중대물자창고.set벽돌들(벽돌들);
    중대물자창고.set합판들(합판들);
    return 중대물자창고;
  }
}
