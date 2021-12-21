package day11;

/*import day11.frult.Banana;
// 임포트 바나나 패키지 소속
import day11.frult.Grape;
// 임포트 그레이프 소속*/

import day11.frult.*;
// * = All

public class Test {

    public static void main(String[] args) {

        new day11.syrub.Apple();
        day11.syrub.Apple a1 = new day11.syrub.Apple();
        day11.frult.Apple a2 = new day11.frult.Apple();

        Banana b1 = new   Banana();
        Grape g1 = new Grape();

    }
}
