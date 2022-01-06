package day19.generic;

import day13.protec.pac1.A;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();
        System.out.println("banana = " + banana);

        //<>안에 클래스
        //새로운 바구니를 만들어라
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.setF(new Apple());
        Apple aa = appleBasket.getF();
        System.out.println("aa = " + aa);

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setF(new Banana());
        Banana nn = bananaBasket.getF();

        Basket<Grape> grapeBasket = new Basket<>();
        grapeBasket.setF(new Grape());
        Grape gg = grapeBasket.getF();


    }
}
