package day17.inter;

public class Main {

    public static void main(String[] args) {
        // 인터페이스는 타입 가능
        // 멀티 상속도 가능
       Pet dog = new Dog();
       Animal tiger = new Tiger();
       Violent shark = new Shark();
    }
}
