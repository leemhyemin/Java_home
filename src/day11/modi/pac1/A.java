package day11.modi.pac1;

public class A {

    //필드
    public int f1;  //퍼블릭 제한

    int f2; //디폴트제한 아무것도 안쓰면 디폴트
    private int f3;

    //메서드
    public void m1() {}
    void m2() {} // 디폴트는 같은 패키지 내에서는 가능 -
    private void m3() {} //같은 패키지 여도 안됌

    //생성자
   public A() {
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3(); // 같은 클래스 내부에서 호출 가능

    }

}
