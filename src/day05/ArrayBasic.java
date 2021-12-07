package day05;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 1. 배열 변수 선언
        int[] arr;  //묶어서 저장하고싶을때

        // 2.배열 생성
        arr = new int[5]; //[]만큼 자리수

        System.out.println(arr);  // 주소

        // 3.배열 초기화
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7; //형변환  66 저장
        arr[4] = 100;
        //arr[5] = 55;

        //배열의 길이 - 총 공간 수
        System.out.println(arr.length); // length 길이

        //배열의 반복문처리
        System.out.println("================================");
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
        System.out.println("================================");

        //향상된 for문 (Enhanced for loop) 배열 전용 for문
        for ( int n : arr){
            System.out.println(n);
        }

        //값 목록 나열로 배열 만들기 {}안에.
        // new int[] 생성시 선언시에만 생략가능 그ㅏ\ㄷ라
        int[] numbers = {10, 20, 30, 40};
        numbers = new int[] {1, 3, 5, 7};
        
        String[] foods = {"사과","자몽","복숭아","딸기"};
        System.out.println(foods); //주소
        System.out.println(Arrays.toString(foods)); //배열 내부값 확인

        //배열을 생성만 하고 초기화 하지 않았다면?
        // -> 각 타입의 기본값으로 자동초기화
        long[] lArr = new long[3];
        System.out.println("lArr.length= " + lArr.length);
        System.out.println(Arrays.toString(lArr));

        String[] dArr = new String[5];
        System.out.println(Arrays.toString(dArr));



    } //end main
} // end class
