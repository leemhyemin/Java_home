package com.kh.practice.chap01_poly;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class Test {

    public static void main(String[] args) {

        LibraryController lc = new LibraryController();

        //회원 생성

        Member kim = new Member("김철수", 15, 'M');

        //회원가입
        lc.insertMember(kim);

        //회원조회
        Member findMember = lc.myInfo();
        //toString 자동
        System.out.println(findMember.toString());
//        System.out.println(lc.myInfo().toString());

        System.out.println("==================================");

        //도서목록 전체 조회
        Book[] books = lc.selectAll();
        for (Book b : books) {
            System.out.println(b.toString());
        }

        System.out.println("====================================");

        String str = "딸기우유 바나나우유 둘 중에 뭘 먹지??";

        //문자열 내부에 특정 단어가 포함되어 있는지 확인
        System.out.println(str.contains("우유"));

        System.out.println("===========================");

        Book[] searchBook = lc.searchBook("루피");
        System.out.println(searchBook.length == 1);
        for (Book b : searchBook) {
            System.out.println(b.toString());
        }

        System.out.println("===========================");
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
        System.out.println(kim.toString());
    }
}
