package day11.modi.pac2;

import day11.modi.pac1.A;
import day11.modi.pac1.B;

public class C {

    public C() {
        A a = new A(); // 접근자 문제 x
        new B();

        a.f1 = 1;
//        a.f2 = 2; 패키지가 달라서 안됨
//        a.f3 = e;
        a.m1();
    }
}
