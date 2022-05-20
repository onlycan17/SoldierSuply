package 장소.창고;

import java.util.List;
import 보급품목.식량1종.간장;
import 보급품목.식량1종.고추가루;
import 보급품목.식량1종.쌀;

public class 대대주식량창고 {
  private List<쌀> 쌀푸대들;
  private List<고추가루> 고추가루봉지들;
  private List<간장> 간장병들;

  public void set쌀푸대들(List<쌀> 쌀푸대들) {
    this.쌀푸대들 = 쌀푸대들;
  }

  public void set고추가루봉지들(List<고추가루> 고추가루봉지들) {
    this.고추가루봉지들 = 고추가루봉지들;
  }

  public void set간장병들(List<간장> 간장병들) {
    this.간장병들 = 간장병들;
  }
}
