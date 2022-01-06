package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

    private boolean coupon; //요리학원 유무

    public CookBook() {
    }

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }
    //boolean getter 만 is로 나타냄
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() +
                "coupon=" + coupon +
                '}';
    }
}
