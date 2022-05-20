package 장소.창고;

import java.util.List;
import 보급품목.식량1종.간장;
import 보급품목.식량1종.고추가루;
import 보급품목.식량1종.쌀;

public final class 대대주식량창고Builder {

  private List<쌀> 쌀푸대들;
  private List<고추가루> 고추가루봉지들;
  private List<간장> 간장병들;

  private 대대주식량창고Builder() {
  }

  public static 대대주식량창고Builder a대대주식량창고() {
    return new 대대주식량창고Builder();
  }

  public 대대주식량창고Builder with쌀푸대들(List<쌀> 쌀푸대들) {
    this.쌀푸대들 = 쌀푸대들;
    return this;
  }

  public 대대주식량창고Builder with고추가루봉지들(List<고추가루> 고추가루봉지들) {
    this.고추가루봉지들 = 고추가루봉지들;
    return this;
  }

  public 대대주식량창고Builder with간장병들(List<간장> 간장병들) {
    this.간장병들 = 간장병들;
    return this;
  }

  public 대대주식량창고 build() {
    대대주식량창고 대대주식량창고 = new 대대주식량창고();
    대대주식량창고.set쌀푸대들(쌀푸대들);
    대대주식량창고.set고추가루봉지들(고추가루봉지들);
    대대주식량창고.set간장병들(간장병들);
    return 대대주식량창고;
  }
}
