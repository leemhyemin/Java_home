package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPushQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자열끼리의 동등비교 시 ==을 사용하지말고
        //(문자열1).equals(문자열2) 를 사용할것!
        // ex) if (s1 == s2) (x)
        //     if (s1.equals(s2)) (o)

        System.out.println("# 먹고싶은 음식을 입력하세요.");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요.");
        System.out.println("========================================");

        String[] foods = {}; //음식이름 저장

        while (true){
            System.out.print(">> "); //입력
            String foodName = sc.next();

            if (foodName.equals("그만")){
                System.out.println("입력을 중지합니다.");
                break; // 종료 조건
            }
            // 1. 원본 배열보다 사이즈가 1개 더 큰 새로울 배열 생성 + 1
            String[] temp = new String[foods.length  + 1];
            
            //2.원본 배열의 값들을 일일히 사본배열로 값복사
            // 푸드 네임 복사
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            // 3. 신규 데이터를 마지막인덱스에 추가
            temp[temp.length - 1] = foodName;

            //4. 주소값 이전
            foods = temp;
            temp = null;

        } // end while
        System.out.println("먹고 싶은 음식: " + Arrays.toString(foods));
        sc.close();
    } // end main
} //end class
