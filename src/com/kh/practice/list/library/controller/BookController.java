package com.kh.practice.list.library.controller;



import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {

    private List<Book> bookList = new ArrayList<>();

    public BookController() {
        bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
        bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
        bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
    }
    // 리스트 값 저장
    public void insertBook(Book bk) {
        bookList.add(bk);
    }
    // 모든 도서 출력
    public ArrayList<Book> selectList() {
        return (ArrayList<Book>) bookList;
    }
    //도서 검색
    public ArrayList<Book> searchBook(String keyword) {
        //검색 결과 리스트 생성
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            //bookList 전체책 목록
            //책 제목
            String title = book.getTitle();
            if (title.contains(keyword)) {
                searchList.add(book);
                //searchList 검색된 책 목록
                //검색 리스트에 그 책을 넣기
            }
        }
        return searchList;
    }
    //삭제
    public Book deleteBook(String title, String author) {
        //삭제될 도서를 담을 변수
        Book removeBook = null;
        for (Book book : bookList) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                removeBook = book;
                bookList.remove(book);
                break;
            }
        }
        return removeBook;
    }
    //오름차 정렬
    public int ascBook() {
        bookList.sort(Book::compareTo);
        return 1;
    }
}
