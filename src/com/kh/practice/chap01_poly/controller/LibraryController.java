package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;


public class LibraryController {

    private Member mem;
    private Book[] bList;

    //대여 기능에 사용할 상수
    public static final int RENT_FAIL = 0;
    public static final int RENT_SUCCESS = 1;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;

    public LibraryController() {
        this.mem = null;
        this.bList = new Book[5];

        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    //회원 가입 기능
    public void insertMember(Member mem) {
        this.mem = mem;
    }

    //회원 정보 조회 기능
    public Member myInfo() {
        return this.mem;
    }

    //도서 전체 목록 조회 기능
    public Book[] selectAll() {
        return bList;
    }

    //제목으로 도서 검색기능
    public Book[] searchBook(String keyword) {
        // 몇개가 검색될지 모르니 책배열 수 만큼 임시배열
        Book[] temp = new Book[bList.length];

        int count = 0; //검색어에 걸린 횟수
        for (int i = 0; i < bList.length; i++) {
            //모든책 있는 배열에서 제목을 뽑아서 검색어가 포함된 그책을 임시배열에 쌓음
            if (bList[i].getTitle().contains(keyword)) {
                temp[count] = bList[i];
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
    //책빌리는 기능
    public int rentBook(int index){
        //배열에서 책 뽑기
        Book book = bList[index];
        // 만화책?
        if (book instanceof AniBook){
            AniBook aniBook = (AniBook) book;
            //제한 나이 
            if (aniBook.getAccessAge() <= mem.getAge()){
                return RENT_SUCCESS;
            }
        // 요리책?
        } else if (book instanceof CookBook) {
            // 쿠폰주려면 book 타입에서 cookBook 타입으로 내리기
            CookBook cookBook = (CookBook) book;
            if (cookBook.isCoupon()) {
                //쿠폰 + 1 기존에 있던 쿠폰
                mem.setCouponCount(mem.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                //대여 성공인데 CookBook 아니라서 쿠폰 안줌
                return RENT_SUCCESS;
            }
        }
        return RENT_FAIL;
    }
}