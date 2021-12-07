package day05;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        // homogeneous -> 배열은 동종모음 구조
        // immutable ->한번 생선된 배열의 크기(길이) 사이즈변경 x
        // reference type -> 주소값 저장

        //배열 데이터 추가 알고리즘
        int newData = 40; // 새롭게 추가할 데이터


        // 1. 원본 배열보다 사이즈가 1개 더 큰 새로울 배열 생성 + 1
        int[] temp = new int[arr.length +1];

        // 2. 원본배열에 있던 기존데이터를 전부 복사해서 새로운 배열로 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3. 신규 데이터를 마지막인덱스에 추가
        temp[temp.length - 1] = newData;

        //4. 주소값 이전
        arr = temp;
        temp = null;

        System.out.println(Arrays.toString(arr));



    }
}
