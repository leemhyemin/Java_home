package day17.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScanner {

    private static Scanner sc = new Scanner(System.in);

    //문자열 입력기능
    public static String inputStr(String message) {
        System.out.print(message);
        String str = sc.nextLine();
        return str;
    }

    // 정수 입력기능
    public static int inputInt(String message) throws InputMismatchException {
        int i = 0;
        System.out.print(message);
        i = sc.nextInt();
        sc.nextLine();
        return i;
    }

    //실수 입력기능
    public static double inputDouble(String message) throws InputMismatchException{
        double d = 0;
        System.out.print(message);
        d = sc.nextDouble();
        sc.nextLine();
        return d;
    }
}
