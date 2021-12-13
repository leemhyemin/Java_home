package day09;

import java.util.Arrays;
import java.util.Objects;

public class MethodQuiz1 {

    static String[] foods = {"치킨", "파스타", "짬뽕"};

    //foods 배열에 새로운 데이터를 끝에 추가하는 함수
    static void push(String newFoods) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFoods;
        foods = temp;
        //함수에선 = null; 안해도 됌
    }
    static int indexOf(String targetFood){
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                return index;
            }
        }
        return -1;
    }
    static String remove(String targetFood) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        push("볶음밥");
        System.out.println(Arrays.toString(foods));

        push("라면");
        System.out.println(Arrays.toString(foods));

        System.out.println("=============================");
        // 1리턴
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);
        // 파스타의 인덱스 번호
        // 3리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        //-1리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);

        System.out.println("=============================");

        remove("볶음밥"); // foods배열에서 볶음밥 제거
        remove("망고"); // 존재하지 않는 음식명 입니다 출력.

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비"); // 2번 인덱스 데이터 닭갈비로 수정
        clear(); //fodds 배열 모든 데이터 삭제

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴


    }
}




