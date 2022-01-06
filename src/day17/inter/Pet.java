package day17.inter;
// 클래스 자리에 interface
public interface Pet {

    //인터페이스 필드는 public static final 자동처리 -> 상수처리
    String PLAY_GROUND = "애완동물카페";

    //인터페이스는 기본적으로 추상메서드 선언하도록 되어 있음.
    void play(); // 애완동물이 노는 기능


}
