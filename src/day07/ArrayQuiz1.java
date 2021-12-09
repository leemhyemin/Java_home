package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //학생 수를 입력받음 1 ~ 80명 사이
        int studentNum;
        while (true) {
            System.out.printf("학생 수를 입력해주세요: ");
            studentNum = sc.nextInt();
            if (studentNum >= 1 && studentNum <= 80) {
                break;
            } else {
                System.out.println("1 ~ 80명 사이로 입력해주세요.");
            }
        } //end while

        //입력받은 학생 수만큼의 점수 배열을 생성
        int[] scores = new int[studentNum];

        System.out.printf("%d명의 점수를 입력해주세요.\n", studentNum);

        for (int i = 0; i < studentNum; i++) {
            System.out.printf("%d번 : ", i + 1);
            int s = sc.nextInt();
            if (s < 0 || s > 100) {
                System.out.println("0 ~ 100점 사이로 입력하세요!");
                i--;
                continue;
            }
            scores[i] = s;
        } // end for

        System.out.println(Arrays.toString(scores));

    }// end main

}// end class