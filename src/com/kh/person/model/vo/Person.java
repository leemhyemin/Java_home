package com.kh.person.model.vo;

public class Person {

    // 필드부
    String name;
    int age;
    double height;
    double weight;

    //생성자부
    public Person() {
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
// toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    // 반환
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age; }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {this.height = height; }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {this.weight = weight; }
}
