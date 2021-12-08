package day06;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class homework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 빈 배열
        int[] arr = {};
        //배열 생성 자리수
        arr = new int[7]; //[]만큼 자리수

        // 입력 포문 
        for (int i = 0; i < 7; i++) {
            System.out.printf("x [" + i + "]: "); // x[0] x[1] x[2]
            arr[i] = sc.nextInt();
        }

        // 원본 복사할 사본배열
        int[] temp = new int[arr.length];

        // 복사 0에서 시작 i 1씩 커짐 arr . 7번 돌아감
        // arr.length - (i + 1) =
        // i = 0이니까 i + 1 하면 i = 1
        // 0,1,2,3,4,5,6 = 7자리
        // i - 1 temp 값 7번째 자리에 입력
        // arr [i] 값 의 반전


        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - (i + 1)] = arr[i];
            // 왼쪽이 공간 오른쪽이 값. 복사개념
        }
        // 주소 변경
        arr = temp;
        temp = null;

        System.out.println("반전했습니다.");
        for (int i = 0; i < 7; i++) {
            System.out.printf("\n x [" + i +  "] : " + arr[i]);
            
        }
        sc.close();
    } // end main
} // end class
