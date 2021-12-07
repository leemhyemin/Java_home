package day04;

import java.util.Scanner;

public class Oper2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.println("========================================");

        int n = 1; //문제번호
        int ok = 0; //정답횟수
        int no = 0; //틀린횟수

        while (true) {
            Math math = null;
            int num = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            System.out.printf("Q%s. %s + %s = ??\n", n++, num, num2);  //Q1 ?? + ?? = ??
            System.out.print(">> "); //입력
            int answer = sc.nextInt();


            if (answer == 0){  // 종료 조건
                System.out.println("게임을 종료합니다.");
                System.out.println("------------------------------------");
                System.out.printf("정답횟수: %d회 , 틀린횟수: %d회", ok, no);
                break;
            }

            if (num + num2 == answer) {
                System.out.println("정답입니다!");
                ok += 1;
            } else {
                System.out.println("틀렸는데요??");
                no += 1;
            }

        }

        sc.close();
    }
}
