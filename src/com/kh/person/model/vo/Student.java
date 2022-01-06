package com.kh.person.model.vo;

public class Student extends Person {

    // 필드부
    String name;
    int age;
    double height;
    double weight;
    int grade; // 학년
    String major; // 전공

    // 생성자부
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }

    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
        this.major = major;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age; }

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height; }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight; }

    public int getGrade() { return grade; }
    public void setGrade(int grade) {this.grade = grade; }

    public String getMajor() {return major; }
    public void setMajor(String major) {this.major = major;}



}
