package day15.poly.basic;

// A의 부모 Object
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
    // 타입이 하나로 통일 될수 있다 부모 상속
    Object x1 = new A();
    Object x2 = new B();
    Object x3 = new C();
    Object x4 = new D();
    Object x5 = new E();
}
