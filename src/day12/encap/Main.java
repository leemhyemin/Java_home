package day12.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("소나타");
        myCar.enginStart(); //시동

        myCar.setMode('D');
        myCar.accelerator();
        myCar.accelerator();



    }
}
