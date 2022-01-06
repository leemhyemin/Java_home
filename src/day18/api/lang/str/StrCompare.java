package day18.api.lang.str;

import java.util.Scanner;

class User{
    String name;

    public User(String 홍길동) {
    }

    void user(String name) {
        this.name = name;
    }
}
//스트링 비교할때 이퀄스 쓰는 이유
public class StrCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("홍길동");

        System.out.printf("- 이름: ");
        String uName = sc.next();

        System.out.println("유저의 이름: "+ user.name);
        System.out.println("입력한 이름: "+ uName);

        System.out.println(" == 으로 비교하기: " + (user.name == uName));
        System.out.println(" equals 로 비교하기: " + (user.name.equals(uName)));

        sc.close();
    }
}
