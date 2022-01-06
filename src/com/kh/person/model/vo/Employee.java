package com.kh.person.model.vo;

public class Employee extends Person{

    String name;
    int age;
    double height;
    double weight;
    int salary; //급여
    String dept; // 부서

    public Employee() { }
    public Employee (String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

    public int getAge() {return age; }
    public void setAge(int age) {this.age = age; }

    public double getHeight() {return height; }
    public void setHeight(double height) {this.height = height; }

    public double getWeight() {return weight; }
    public void setWeight(double weight) {this.weight = weight; }

    public int getSalary() {return salary; }
    public void setSalary(int salary) {this.salary = salary; }

    public String getDept() {return dept;}
    public void setDept(String dept) {this.dept = dept; }
}
