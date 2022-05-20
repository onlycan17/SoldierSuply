package 장소.보급부서;

import 보급병종류.대대보급병13종;
import 보급병종류.대대보급병24종;

public class 대대지원과 implements I보급부서{
  private 대대보급병13종 대대13종;
  private 대대보급병24종 대대24종;

  public void set대대13종(대대보급병13종 대대13종) {
    this.대대13종 = 대대13종;
  }

  public void set대대24종(대대보급병24종 대대24종) {
    this.대대24종 = 대대24종;
  }
}
