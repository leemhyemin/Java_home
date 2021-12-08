package day06;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {50, 150, 250, 300};
        // 50 과 150 사이에 100추가하기.

        System.out.println("추가 전: "+ Arrays.toString(arr));

        int newNumber = 100; //신규 삽입데이터
        int targetIndex = 1; // 삽입 위치

        // 1. 사이즈가 하나 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 기존데이터를 전부복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
            // 왼쪽이 공간 오른쪽이 값. 복사개념
        }
        System.out.println("추가 후: "+ Arrays.toString(temp));

        // 3. 끝데이터부터 뒤로 밀기
        for (int i = temp.length-1; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

//            temp[4] = temp[3];
//            temp[3] = temp[2];
//            temp[2] = temp[1];
//            temp[1] = temp[0];

        // 4. 타겟인덱스에 데이터 추가
        temp[targetIndex] = newNumber;

        // 5. 주소변경
        arr = temp;
        temp = null;






    } // end main
} //end class
