package day12.obj_array;

import day12.encap.Car;

public class Main {

    public static void main(String[] args) {
         // 배열에 넣기
        CarShop hyundai = new CarShop("현대 자동차", 4);
        CarShop mercedes = new CarShop("메르세데스 벤츠", 3);

        Car grander = new Car("그랜져");
        hyundai.importCar(grander);  // 입고 4대까지
        hyundai.importCar(new Car("투싼"));
        hyundai.importCar(new Car("싼타페"));
        hyundai.importCar(new Car("아반떼N"));
        hyundai.importCar(new Car("소나타"));

        mercedes.importCar(new Car("C200"));
        mercedes.importCar(new Car("s63 AMG"));
        mercedes.importCar(new Car("C43 AMG"));
        mercedes.importCar(new Car("E400"));

        System.out.println("========================");

        hyundai.showAllCars();
        hyundai.exportCar("제네피스쿠페");


        Car s63Amg = mercedes.exportCar("S63 AMG");
        mercedes.showAllCars();

        CarShop kia = new CarShop("기아 자동차", 5);

    }
}
