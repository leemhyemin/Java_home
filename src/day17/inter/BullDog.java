package day17.inter;
// 2중상속 가능
public class BullDog extends Animal implements Pet, Huntable{

// 초기 기능 상태 만들기

    @Override
    public void eat() {
        System.out.println("불독은 잡다한걸 다 먹어요~");
    }

    @Override
    public void hunt(String target) {
        System.out.println("불독은 사납게 사냥해요~");
    }

    @Override
    public void play() {
        System.out.println("불독은 방방거리면서 놀아요~");
    }
}
