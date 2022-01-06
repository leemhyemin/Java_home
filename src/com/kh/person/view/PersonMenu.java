package com.kh.person.view;

import java.util.Scanner;

public class PersonMenu {
    static Scanner sc = new Scanner(System.in);
    static int M = 0;
    static int N = 0;

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 학생은 %d 명입니다.\n", M);
        System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 사원은 %d 명입니다.\n", N);

        //M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
        //personCount() 메소드의 반환값을 이용하여 출력

        System.out.println(" 1. 학생메뉴 | 2. 사원메뉴 | 9. 끝내기");
        int menu = sc.nextInt();
//        switch (menu)

        if (menu == 1) {
            studentMenu();
        } else if (menu == 2) {
//            employeeMenu();
        }else{
            System.out.println("종료합니다.");
        }
    }
    // 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
    public static void studentMenu() {
        System.out.println("1. 학생추가 | 2. 학생보기 | 9. 메인으로 ");
        int stmenu = sc.nextInt();
        if (stmenu == 1){
//            insertStudent();
        } else if (stmenu == 2) {
//            printStudent()
        }else{
            System.out.println("메인으로 돌아갑니다.");
            mainMenu();
        }


    }

    public void employeeMenu(){} //사원추가

    public void insertStudent() {

    }
}
