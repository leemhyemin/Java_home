package day17.inter;
// 상속을 먼저 상속뒤 인터페이스
// 인터페이스를 받아올때는 implements
public class Dog extends Animal implements Pet{

    @Override
    public void play() {
        System.out.println("강아지는 산책하면서 놀아요~");
    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 먹어요~");
    }
}
