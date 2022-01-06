package day14.static_;

public class Count {

    public int x; // 인스턴스 필드
    public static int y; // 스태틱 필드

    static {
        y = 20;
    }

    public Count() {
        x = 10;
        y = 20;
    }

    public void m1() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
//        this.m2();
    }
    public static void m2() {
//        System.out.println("x = " + x);
        System.out.println("y = " + y);
//        m1();

        Count ccc = new Count();
        ccc.x = 10;
        ccc.m1();



    }
}
