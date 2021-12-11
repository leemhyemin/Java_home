package day08;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        // 2차원 1차 함별안에 배열들
        // 3명의 4과목 점수
        // [][] 배열안에 배열을 묶는것
        // int 배열의 배열을 묶어서 length 3
        int[][] scores = {
                {80,90,85,95},
                {90,60,75,85},
                {95,90,85,55}
        };

        System.out.println("scores.length = " + scores.length); // 3개
        System.out.println("scores[1][1] = " + scores[1][1]); // 1번의 1번자리
        System.out.println("scores = " + Arrays.toString(scores[2]));//2번자리배열

        System.out.println(Arrays.toString(scores));
        System.out.println("============================================");

        //데이터 수정
        //2번째 배열의 2번째 점수 수정
        scores[1][2] = 90;

        scores[2] = new int[]{100, 100, 100, 100};
        //변수와 변수타입 : 오른쪽에 배열
        //2차 함별은 하나 꺼내면 1차함별
        for (int[] arr : scores) {
            for (int n : arr) {
                System.out.printf("%d ", n);
            }
            System.out.printf("\n");
        }
        System.out.println("===========================================");

        // 생성문으로 2차원 배열만들기 (3행 x 5열)
        int[][] arr2d = new int[3][5];  //length 3 들어있는데이터 5
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.printf("\n");
        }
        int[][][] arr3d = {
                { {1,1,1},{2,2,7},{3,3,3} },
                { {4,4,4},{3,3,3},{2,220,2} },
                { {1,1,1},{2,2,2},{5,5,5} }
        };
        System.out.println(arr3d[1][2][1]);

        for (int[][] ints : arr3d) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }
            }
        }



    } // end main
} // end class