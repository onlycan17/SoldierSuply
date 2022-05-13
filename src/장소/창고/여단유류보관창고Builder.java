package 장소.창고;

import java.util.List;
import 보급품목.유류3종.가스;
import 보급품목.유류3종.경유;
import 보급품목.유류3종.석유;
import 보급품목.유류3종.휘발유;

public final class 여단유류보관창고Builder {

  private List<경유> 경유리터;
  private List<석유> 석유리터;
  private List<휘발유> 휘발유리터;
  private List<가스> 가스리터;

  private 여단유류보관창고Builder() {
  }

  public static 여단유류보관창고Builder a여단유류보관창고() {
    return new 여단유류보관창고Builder();
  }

  public 여단유류보관창고Builder with경유리터(List<경유> 경유리터) {
    this.경유리터 = 경유리터;
    return this;
  }

  public 여단유류보관창고Builder with석유리터(List<석유> 석유리터) {
    this.석유리터 = 석유리터;
    return this;
  }

  public 여단유류보관창고Builder with휘발유리터(List<휘발유> 휘발유리터) {
    this.휘발유리터 = 휘발유리터;
    return this;
  }

  public 여단유류보관창고Builder with가스리터(List<가스> 가스리터) {
    this.가스리터 = 가스리터;
    return this;
  }

  public 여단유류보관창고 build() {
    여단유류보관창고 여단유류보관창고 = new 여단유류보관창고();
    여단유류보관창고.set경유리터(경유리터);
    여단유류보관창고.set석유리터(석유리터);
    여단유류보관창고.set휘발유리터(휘발유리터);
    여단유류보관창고.set가스리터(가스리터);
    return 여단유류보관창고;
  }
}
