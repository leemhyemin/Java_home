package day13.inherit;

import java.util.Random;

public class Warrior extends Player{

    public int rage;

    public Warrior() {
    }

    public Warrior(String name) {
        super(name); //부모의 생성자 호출
        System.out.println("Warrior 객체 생성!");
        this.rage = 100;
    }
    //오버라이딩 룰 검증
    //부모의 메서드와 동일한 시그니처를 가질것. 이름 리턴타입 매개변수
    //접근 제한을 더 강화해서 오버라이딩 할수 없음.
    @Override
    public void info(){
        super.info();
        System.out.println("# 분노: "+ rage);

    }

    public void fireRush(Player ... targets) {
        for (int i = 0; i < targets.length; i++) {
            System.out.println("==========================================");
            System.out.println("FireRush 시전!!!");
            System.out.printf("%s님이 %s 님에게 FireRush 를 시전했습니다!",this.name,i);

            Random r = new Random();
            for (Player p : targets) {
                //맞은 사람이 혹시 나?
                if(p == this) continue;
                //15~20의 ㄹ랜덤 피해
                int daWarrior = r.nextInt(11) + 10;
                //실제 체력에서 차감
                p.hp -= daWarrior;
                System.out.printf("%s님 %d의 피해를 입었습니다.(%s님의 체력: %d)\n", this.name, daWarrior, this.name, p.hp );
            }
        }
    }
}
