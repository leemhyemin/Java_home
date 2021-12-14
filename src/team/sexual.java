package team;
import day02.StdOutput;

import java.net.SocketTimeoutException;
import java.util.Scanner;

class User{
    String id;
    String pw;
}
class UserManger{
    static Scanner sc = new Scanner(System.in);
    static User[] user = null;
    static int idcnt = 0;

    //회원가입
    static void UserAdd(){
        System.out.println("☆ 회원 가입을 시작합니다 ☆");
        if(idcnt == 0){
            user = new User[1];
        }else {
            User[] temp = user;
            user = new User[idcnt + 1];
            for (int i = 0; i < idcnt; i++) {
                user[i] = temp[i];
            }
        }
        user[idcnt] = new User();
        System.out.println("아이디를 입력하세요");
        String memberid = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String memberpw = sc.next();
        user[idcnt].id = memberid;
        user[idcnt].pw = memberpw;
        idcnt += 1;
        System.out.println(memberid + "님 반갑습니다. (*´∀`*)");
        System.out.println("₍₍ ◝(・ω・)◟ ⁾⁾ 환영합니다.");
    }
    // 회원탈퇴
    static void UserDel(){
        System.out.println("삭제할 아이디를 입력하세요");
        int index = -1;
        String delid = sc.next();
        System.out.println("삭제할 비밀번호를 입력하세요");
        String delpw = sc.next();
        for (int i = 0; i < idcnt - 1; i++) {
            if(delid.equals(user[i].id) && delpw.equals(user[i].pw)) {
                index = i;
            }
        }
        User temp2[] = user;
        user = new User[idcnt -1 ];
        for (int i = 0; i < index; i++) {
            user[i] = temp2[i];
        }
        for (int i = index; i < idcnt--; i++) {
            user[i] = temp2[i + 1];
        }
        idcnt -= 1;
        System.out.println("삭제가 완료되었습니다. ₍₍ (ง ˙ω˙)ว ⁾⁾ ");
    }
    // 아이디 찾기
    static void UserPrint(){
        for (int i = 0; i < idcnt; i++) {
            System.out.println(" (ง •̀ω•́)ง✧ 아이디만 보입니다.");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println(user[i].id + " 입니다.");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
        }
    }
    // 로그인
    static void UserLogin(){
        System.out.println("[* 아이디: ]");
        String id = sc.next();
        System.out.println("[* 비밀번호: ]");
        String pw = sc.next();
        int log = 0;
        for (int i = 0; i < idcnt; i++) {
            if (user[i].id.equals(id) && user[i].pw.equals(pw)) {
                log = i;
                System.out.println(user[log].id + "님이 로그인 하셨습니다.");
                System.out.println(user[log].id + "님 반갑습니다. (*´∀`*)");
                return;
            }else{
                System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
            }
        }
    }
    static void UserLogout(){
        System.out.println("[* 아이디: ]");
        String id = sc.next();
        System.out.println("[* 비밀번호: ]");
        String pw = sc.next();
        int log;
        for (int i = 0; i < idcnt; i++) {
            if (user[i].id.equals(id) && user[i].pw.equals(pw)) {
                log = i;
                System.out.println(user[log].id + "님이 로그아웃 하셨습니다.(｡•́︿•̀｡) ");
            }
        }
    }
}

// 함수 실행부
public class sexual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idcnt = 0;
        User user[] = null;

        int x = 0;
        System.out.println("=========================================");
        System.out.println("         # 성적 관리 프로그램 #");
        System.out.println("=========================================");
        while(x == 0){
            System.out.println("계정이 없으면 회원가입 먼저 해주세요.");
            System.out.println("로그인 해주세요.");

            System.out.println("* 1. 회원가입 || * 2.계정 삭제 || * 3. 아이디찾기");
            System.out.println("* 4. 로그인 || * 5. 로그아웃|| * 6. 종료");
            int join = sc.nextInt();

            if (join == 1){
                UserManger.UserAdd();
            }else if (join == 2) {
                UserManger.UserDel();
            }else if (join == 3) {
                UserManger.UserPrint();
            } else if (join == 4) {
                UserManger.UserLogin();
            } else if (join == 5) {
                UserManger.UserLogout();
            }else{
                System.out.println(" (￣▽￣)ノ 종료합니다. ");
                break;
            }
        }//end while
    } // end main
}//end class
