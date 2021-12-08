package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //빈 배열 생성
        int[] arr = {};

        //복사할 다른 배열 생성
        int[] temp = new int[arr.length];

        //맨 마지막 데이터를 제외한 나머지를 새로운 배열로 복사
        // 새로운 배열 크기의 횟수만큼 돌리기
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));

    } // end main
} // end class