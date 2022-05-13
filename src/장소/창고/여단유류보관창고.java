package 장소.창고;

import java.util.List;
import 보급품목.유류3종.가스;
import 보급품목.유류3종.경유;
import 보급품목.유류3종.석유;
import 보급품목.유류3종.휘발유;

public class 여단유류보관창고 {
  private List<경유> 경유리터;
  private List<석유> 석유리터;
  private List<휘발유> 휘발유리터;
  private List<가스> 가스리터;

  public void set경유리터(List<경유> 경유리터) {
    this.경유리터 = 경유리터;
  }

  public void set석유리터(List<석유> 석유리터) {
    this.석유리터 = 석유리터;
  }

  public void set휘발유리터(List<휘발유> 휘발유리터) {
    this.휘발유리터 = 휘발유리터;
  }

  public void set가스리터(List<가스> 가스리터) {
    this.가스리터 = 가스리터;
  }
}
