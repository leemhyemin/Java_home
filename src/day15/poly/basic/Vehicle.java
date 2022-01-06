package day15.poly.basic;

class Bus extends Vehicle {}
class Taxi extends Vehicle {}
class Airplane extends Vehicle {}

class Student {
    // 학교가는 . 이동수단
    Vehicle vehicle;

    void goToSchool() {
        vehicle = new Airplane();
    }
}

public class Vehicle {

}
