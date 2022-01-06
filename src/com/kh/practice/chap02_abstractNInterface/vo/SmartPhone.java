package com.kh.practice.chap02_abstractNInterface.vo;

public abstract class SmartPhone {
    
    String maker; //제조사 정보

    public SmartPhone(String maker) {
        this.maker = maker;
    }

    //스마트폰의 제원정보 출력
    public String printInformation() {
        return null;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
