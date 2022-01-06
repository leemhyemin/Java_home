package day14.static_;

public class Main {

    public static void main(String[] args) {

        Count.y++;
        System.out.println(Count.y);
        
        String a = new String("ㅇㅇ");
        String b = "하하하";

        Count.m2();
        Count.y = 11; // static 멤버는 객체생성 없이 사용가능

        Count c1 = new Count();
        Count c2 = new Count();


        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);

        Count.y = 5;
        Count.y++;
        Count.y -= 5;

        System.out.println("c1.y = " + Count.y);
        System.out.println("c2.y= " + Count.y);

    }
}
