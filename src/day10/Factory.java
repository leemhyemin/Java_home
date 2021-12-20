package day10;

// 실행용 클래스
public class Factory {

    public static void main(String[] args) {

        //객체의 생성 (핸드폰을 만드는 과정)
        Phone galaxy = new Phone("갤럭시 S21"); //생성자 함수 Phone();
        System.out.println("galaxy = " + galaxy);

        //객체의 속성과 기능을 참조 할때 : .연산자
        galaxy.showSpec();

        System.out.println("================================================");

        Phone haptic = new Phone("아이폰 13");

        haptic.showSpec();

        System.out.println("==========================================");

        Phone iPhone = new Phone("아이폰 X","스페이스 그레이");
        iPhone.showSpec();

        System.out.println("==========================================");

        iPhone.sendMessage(galaxy, "하이~~~");
        iPhone.sendMessage(galaxy, "뭐해??");
        iPhone.sendMessage(galaxy, "하하하하ㅏ");

        galaxy.checkMessages();

        haptic.sendMessage(iPhone, "안뇽~");
        galaxy.sendMessage(iPhone, "나는 갤럭시야~");

        iPhone.checkMessages();
        galaxy.checkMessages();

   }
}


