package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("========================================");
        sc.nextLine(); //엔터 입력받기
        int n = 1; //문제번호
        while (true) {
            Math math = null;
            int num = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            System.out.printf("Q%d. %d + %d = ??\n", n++, num, num2);  //Q1 ?? + ?? = ??
            System.out.print(">> "); //입력
            int answer = sc.nextInt();

            if (num + num2 == answer) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸는데요??");
            }
            if (answer == 0)
                break; // 종료 조건

        } // end while
            System.out.println("게임을 종료합니다.");
            sc.close();
    } //end main
} //end class


