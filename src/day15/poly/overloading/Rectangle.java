package day15.poly.overloading;
// 매개변수 타입으로 구분.
// 로딩은 쌓는다 하나의 메서드에서 쌓기
public class Rectangle {
    //정사각형의 넓이를 구하는 기능
    //calcArea(int)
    public int calcArea(int length) {
        return length * length;
    }
    // 리턴타입 매개변수 달라도 똑같다고 봄 신경쓰지않음.
    //calcArea(int)
//    public void calcArea(int a) {}

    //직사각형의 넓이를 구하는 기능
    //calcArea(int, int)
    public int calcArea(int width, int height) {
        return width * height;
    }
    //calcArea(int, double) -> calArea(10, 3.5)
    public void calcArea(int x, double y) {}

    //calcArea(double, int) -> calcArea(5.5, 3)
    public String calcArea(double x, int y) {
        System.out.println();
        return null;
    }
}
