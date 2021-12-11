package day08;
import java.util.Scanner;
import java.util.Random;

public class Russian_Rullet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random rnd = new Random();
        //랜덤객체 생성
        Scanner sc = new Scanner(System.in);
        //스캐너 객체 생성

        System.out.println("참여자 수를 입력해주세요 :");
        int p = sc.nextInt();
        //참여자 수를 입력받아 p에 저장

        String name[] = new String[p];
        //참여자 수 만큼 배열을 생성

        int a = rnd.nextInt(name.length);
        //a 에 참여자 수까지 에서의 난수를 하나 생성하여 저장(0~a)

        for(int i = 0; i < p; i++) {
            System.out.println("참가자의 이름을 입력해주세요 :\n");
            name[i] = sc.next();
        //for문을 돌려 참가자의 이름을 입력받아 String배열에 저장함
        }
        for(int i =0; i<p; i++) {
            if(i==a) {
                System.out.println(name[i]+"님은 사망하였습니다");
            }
            else
                System.out.println(name[i]+"님은 생존하였습니다");
        }
        //for문을 a와 배열의 인덱스를 비교, 난수에 해당하는 인덱스를 가진사람은 사망한다.


        sc = null;
        rnd = null;
        System.gc();


    } // end main

} // end class