package 장소.창고;

import java.util.ArrayList;
import java.util.List;
import 보급품목.건축자재4종.공구;
import 보급품목.건축자재4종.벽돌;
import 보급품목.건축자재4종.시멘트;
import 보급품목.건축자재4종.페인트;
import 보급품목.건축자재4종.합판;
import 보급품목.보급물자2종.I소모품;
import 보급품목.보급물자2종.I장구류;
import 보급품목.보급물자2종.I피복류;
import 보급품목.보급물자2종.방탄조끼;
import 보급품목.보급물자2종.비누;
import 보급품목.보급물자2종.생활복;
import 보급품목.보급물자2종.수통;
import 보급품목.보급물자2종.슬리퍼;
import 보급품목.보급물자2종.전투복;
import 보급품목.보급물자2종.전투화;
import 보급품목.보급물자2종.헬멧;
import 보급품목.보급물자2종.휴지;

public class 중대물자창고 {
  //중대 물자
  private List<I장구류> 방탄조끼들;
  private List<I장구류> 헬멧들;
  private List<I장구류> 수통들;
  private List<I피복류> 전투화들;
  private List<I피복류> 생활복들;
  private List<I소모품> 휴지들;
  private List<I소모품> 비누들;

  private List<시멘트> 시멘트들;
  private List<벽돌> 벽돌들;
  private List<합판> 합판들;

  public void set방탄조끼들(List<I장구류> 방탄조끼들) {
    this.방탄조끼들 = 방탄조끼들;
  }

  public void set헬멧들(List<I장구류> 헬멧들) {
    this.헬멧들 = 헬멧들;
  }

  public void set수통들(List<I장구류> 수통들) {
    this.수통들 = 수통들;
  }

  public void set전투화들(List<I피복류> 전투화들) {
    this.전투화들 = 전투화들;
  }

  public void set생활복들(List<I피복류> 생활복들) {
    this.생활복들 = 생활복들;
  }

  public void set휴지들(List<I소모품> 휴지들) {
    this.휴지들 = 휴지들;
  }

  public void set비누들(List<I소모품> 비누들) {
    this.비누들 = 비누들;
  }

  public void set시멘트들(List<시멘트> 시멘트들) {
    this.시멘트들 = 시멘트들;
  }

  public void set합판들(List<합판> 합판들) {
    this.합판들 = 합판들;
  }

  public void set벽돌들(List<벽돌> 벽돌들) {
    this.벽돌들 = 벽돌들;
  }


  public  void 보급물자주입(){
    List<I장구류> 방탄조끼들 = new ArrayList<>();
    List<I장구류> 수통들 = new ArrayList<>();
    List<I장구류> 헬멧들 = new ArrayList<>();

    List<I피복류> 전투복들 = new ArrayList<>();
    List<I피복류> 전투화들 = new ArrayList<>();
    List<I피복류> 생활복들 = new ArrayList<>();
    List<I피복류> 슬리퍼들 = new ArrayList<>();

    List<I소모품> 휴지들 = new ArrayList<>();
    List<I소모품> 비누들 = new ArrayList<>();

    List<시멘트> 시멘트푸대들 = new ArrayList<>();
    List<페인트> 페인트통들 = new ArrayList<>();
    List<벽돌> 벽돌들 = new ArrayList<>();
    List<공구> 공구들 = new ArrayList<>();
    List<합판> 합판들 = new ArrayList<>();

    double random = Math.random();
    int ea = (int)(random * 2999);

    for (int i = 0; i < ea; i++) {
      방탄조끼들.add(new 방탄조끼());
    }

    for (int i = 0; i < ea; i++) {
      수통들.add(new 수통());
    }

    for (int i = 0; i < ea; i++) {
      헬멧들.add(new 헬멧());
    }


    전투복들.add(new 전투복());
    전투화들.add(new 전투화());
    생활복들.add(new 생활복());
    슬리퍼들.add(new 슬리퍼());

    휴지들.add(new 휴지());
    비누들.add(new 비누());

    시멘트푸대들.add(new 시멘트());
    페인트통들.add(new 페인트());
    벽돌들.add(new 벽돌());
    공구들.add(new 공구());
    중대물자창고Builder
        .a중대물자창고()
        .with방탄조끼들(방탄조끼들)
        .with수통들(수통들)
        .with헬멧들(헬멧들)
        .with전투화들(전투화들)
        .with전투복들(전투복들)
        .with생활복들(생활복들)
        .with휴지들(휴지들)
        .with비누들(비누들)
        .with벽돌들(벽돌들)
        .with시멘트들(시멘트푸대들)
        .with합판들(합판들)
        .build();
  }


}
