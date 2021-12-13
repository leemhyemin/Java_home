package day09;
    /*
        1. 자바의 함수는 클래스 내부, 함수외부에 정의합니다.
        2. 함수의 호출은 메서드 내부에서만 가능합니다. main X
        3.
     */

public class MethodBasic {

    // 1 ~ x 까지의 총합을 구하는 함수 정의
    /*
    def calcTotal(x):
        total = 0
        for n in range(x):
            total +=
        return total;
     */

    static int calcTotal (int x) {
        System.out.println("함수 호출!");
       int total = 0;
        for (int n = 1; n <= x; n++){
            total += n;
        }
        //calcTotal(); 제비호출
        return total;
    }

    public static void main(String[] args) {

//        // 1 ~ 10 까지 총합
//        int total = 0 ;
//        for (int i = 1; i <= 10; i++) {
//            total += 1;
//        }

        // 함수호출출
       int result = calcTotal(10);
       System.out.println("result = " + result);
        int i = calcTotal(100);
        System.out.println("i = " + i);

    } // end mai
} // end class