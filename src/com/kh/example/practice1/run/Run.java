package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

    public static void main(String[] args) {
        //알트 엔터 임포트 만든 클래스.
        Member m = new Member("김철수", 30, "010-1234-1234");
        m.changeName("박영희");
        m.changeName("홍길동");
        m.printName();
        m.information();
    }
}
