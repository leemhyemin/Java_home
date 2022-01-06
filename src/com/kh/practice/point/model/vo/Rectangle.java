package com.kh.practice.point.model.vo;

public class Rectangle extends Point{

    //필드부
    private int width;
    private int height;
    
    //생성자 부
    public Rectangle() {

    }

    public Rectangle(int x, int y, int width, int height) {
        super(x,y);	// 부모클래스 생성자 호출
        this.width = width;
        this.height = height;
    }

    //메서드부
    public String toString() {
        return super.toString() + " "+width+ " "+height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
