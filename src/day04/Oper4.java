package day04;

import java.util.Scanner;

public class Oper4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.println("========================================");
        System.out.println("~~~~~~~~~~~~~~~난이도를 설정합니다.~~~~~~~~~~~~~~~~~~~");
        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~10) ]");
        System.out.print(">>> ");
        int level = sc.nextInt();

        int lv;

        if(level == 1){
            lv = 100;
        }else if(level == 2){
            lv = 50;
        }else if(level == 3){
            lv = 10;
        }else{
            lv = 999;
        }

        int n = 1; //문제번호
        int ok = 0; //정답횟수
        int no = 0; //틀린횟수
        String mark;
        int real;

        // int markNum = r.nextInt(dound:3) // 0~3 미만

        while (true) {
            Math math = null;
            int num = (int) (Math.random() * lv);
            int num2 = (int) (Math.random() * lv);
            int markNum = (int) (Math.random() * 3); //연산기호 랜덤

            if (num == 0) {
                num++;
            }
            if (num2 == 0) {
                num2++;
            }
            if(markNum == 1){
                mark = "+";
                real = num + num2;

            }else if(markNum == 2){
                if(num == num2){
                    num --;
                }
                if(num < num2){  // 변수 하나를 더 만들어서 변수 바꾸는 방법
                    int temp = num;
                    num = num2;
                    num2 = temp;
                }
                mark = "-";
                real = num - num2;
            }else{
                mark = "x";
                real = num * num2;
            }



            System.out.printf("Q%d. %d %s %d = ??\n", n++, num, mark, num2);  //Q1 ?? + ?? = ??
            System.out.print(">> "); //입력
            int answer = sc.nextInt();


            if (answer == 0){  // 종료 조건
                System.out.println("게임을 종료합니다.");
                System.out.println("------------------------------------");
                System.out.printf("정답횟수: %d회 , 틀린횟수: %d회", ok, no);
                break;
            }

            if (real == answer) {
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
