package day06;

import java.util.Arrays;
import java.util.Scanner;

public class tvxqQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 삭제 전 정보: " + Arrays.toString(tvxq));

        // 1. 삭제 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 삭제
        // 6. 위 내용을 삭제가 정확히 완료될때까지 반복한다.

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요.");
            System.out.printf(">> ");
            String targetName = sc.next();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (targetName.equals(tvxq[i])) {
                    index = i;
                    break;
                }
            }
            //탐색

            for (int i = 0; i < tvxq.length-1; i++) {
                tvxq[i] = tvxq[i+1];
            }

            String[] temp = new String[tvxq.length-1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = tvxq[i];
            }

            //삭제 여부 판단
            if (index != -1) {
                System.out.printf("%s의 별명을 삭제합니다.\n", targetName);
                String newName = sc.next();
                tvxq[index] = newName;
                System.out.println("삭제 완료!!");
                System.out.println("* 삭제 후 정보: " + Arrays.toString(tvxq));
                break;
            } else {
                System.out.printf("해당 별명 (%s)은 존재하지 않습니다.\n", targetName);

            } // end if
        } // end while
    } // end main
} // end class