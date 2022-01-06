package day13.inherit;

import java.util.Random;

public class Mage extends Player {

    public int mana;

    public Mage() {
    }

    public Mage(String name) {
        System.out.println("Mage 객체 생성됨!");
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }

    @Override
    public void info(){
       super.info();
        System.out.println("# 마나: "+ mana);
    }

    public void blizzard(Player... targets) {
        System.out.printf("# %s님 눈보라 시전!!!!\n", this.name);
        System.out.println("=======================================");

        Random r = new Random();
        for (Player p : targets) {
            // 맞은 사람이 혹시 나??
            if (p == this) continue;

            //10~ 15의 랜덤피해
            int damage = r.nextInt(6) + 10;
            //실제 체력에서 차감
            p.hp -= damage;
            System.out.printf("%s님 %d의 피해를 입었습니다.(남은 체력: %d)\n",
                    p.name, damage, p.hp);
        }
    }
}
