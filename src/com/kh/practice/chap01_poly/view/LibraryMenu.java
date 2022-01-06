package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryController lc = new LibraryController();
    private Scanner sc =new Scanner(System.in);

    public void mainMenu() {

        System.out.println("#회원 정보를 입력해주세요.");
        System.out.printf("이름: ");
        String name = sc.next();

        System.out.printf("나이: ");
        int age = sc.nextInt();

        System.out.printf("성별(M/F): ");
        //첫글자 0번
        char gender = sc.next().charAt(0);

        lc.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("\n=============== 도서 메뉴 =================");
            System.out.println("#1. 마이페이지");
            System.out.println("#2. 도서 전체 조회");
            System.out.println("#3. 도서 검색");
            System.out.println("#4. 도서 대여하기");
            System.out.println("#9. 프로그램 종료하기");

            System.out.printf("- 메뉴 번호: ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println(lc.myInfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    // 시스템 종료
                    System.exit(0);
                default:
                    System.out.println("# 메뉴 번호를 잘못 입력했습니다.");
            }
        }
    }

    //도서 대여
    private void rentBook() {

        String RentBook = sc.next();
        System.out.printf("대여할 도서: ");

        int flag = lc.rentBook(3);
        switch (flag) {
            case LibraryController.RENT_SUCCESS:
                System.out.println("대여 성공!");
                break;
            case LibraryController.RENT_SUCCESS_WITH_COUPON:
                System.out.println("대여 성공! 쿠폰 발급!");
                System.out.println("Cook 전용 쿠폰입니다");
                break;
            default:
                System.out.println("대여 실패!");
                System.out.println("나이에 맞지 않습니다.");
        }
//        System.out.println(kim.toString());
    }

    //도서 검색
    private Book[] searchBook() {
        System.out.println("검색할 도서: ");
        String bookName = sc.next();
        
        // 몇개가 검색될지 모르니 책배열 수 만큼 임시배열
        Book[] books = lc.selectAll();
        Book[] temp = new Book[books.length];

        int count = 0; //검색어에 걸린 횟수

        for (int i = 0; i < books.length; i++) {
            //모든책 있는 배열에서 제목을 뽑아서 검색어가 포함된 그책을 임시배열에 쌓음
            if (books[i].getTitle().contains(bookName)) {
                temp[count] = books[i];
            }
        }
        //검색어에 해당하는 책 배열
        //카운트만큼 배열사이즈 만들고 검색된 책들 배열에 넣기
        Book[] searched = new Book[count];
        for (int i = 0; i < count; i++) {
            searched[i] = temp[i];
        }
        return searched;
    }

    //도서 전체조회
    private void selectAll() {
        Book[] books = lc.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d번째 도서: %s\n", i + 1, books[i].toString());
        }
    }
}
