package com.kh.practice.list.music.view;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Scanner;

public class MusicView {

    private MusicController mc = new MusicController();
    private Scanner sc = new Scanner(System.in);

    public MusicView() {
        mainMenu();
    }

    private String input(String msg) {
        System.out.printf(msg);
        return sc.nextLine();
    }

    private int toInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("# 정수형 숫자로만 입력하세요!");
            return 0;
        }
    }

    private void mainMenu() {
        while (true) {
            System.out.println("***** 메인 메뉴 *****");
            System.out.println("# 1. 마지막 위치에 곡 추가");
            System.out.println("# 2. 첫 위치에 곡 추가");
            System.out.println("# 3. 전체 곡 목록 출력");
            System.out.println("# 4. 특정 곡 검색");
            System.out.println("# 5. 특정 곡 삭제");
            System.out.println("# 6. 특정 곡 정보 수정");
            System.out.println("# 7. 곡명 오름차순 정렬");
            System.out.println("# 8. 가수명 내림차순 정렬");
            System.out.println("# 9. 프로그램 종료");

            int menu = toInteger(input("메뉴 번호 선택: "));

            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }
        }
    }
}