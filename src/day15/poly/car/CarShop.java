package day15.poly.car;

public class CarShop {
    // 변수 instanceof 타입
    public int sellCar(Car car) {
        if (car instanceof Sonata) {
            return 2000;
        } else if (car instanceof Tucson) {
            return 2200;
        } else if (car instanceof Stinger) {
            return 2800;
        } else {
            return 0;
        }
    }
}
