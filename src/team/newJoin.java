package team;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class newJoin<UserID, User> {
    /*
        성적 관리 프로그램
            로그인
            선생님만 관리자
            입력 및 수정
            개인 학생 - 개인 점수만 볼수있음
            입력 및 수정
            1~5반 까지
            선생님이 학생수 입력
            ex 5명 입력시 각 5 학생은 시험점수 입력
            평균 50점 미만 보충수업
            장학생 200만원
            전체 학생 점수 상위 3프로
            #학교 규칙
    */
    static Scanner sc = new Scanner(System.in);
    static int idcnt = 0;
    // 선생님 회원가입
    static String[] teacher = {}; // 선생님 이름 저장
    static String[] teacherID = {}; 
    static String[] teacherPW = {};
    // 학생 회원가입
    static String[] studentID = {};
    static String[] studentPW = {};
    static String[] student = {};
    
    //회원가입 함수
    public static void UserAdd() {
        System.out.println("* 1. 선생님 || * 2. 학생 ||");
        int JoinMenu = sc.nextInt();
        if (JoinMenu == 1) {
            System.out.println("☆ 선생님으로 회원 가입을 시작합니다 ☆");
            System.out.println("이름을 입력하세요");
            String teachername = sc.next();
            String[] temp = new String[teacher.length + 1];
            for (int i = 0; i < teacher.length; i++) {
                temp[i] = teacher[i];
            }
            temp[temp.length - 1] = teachername;
            teacher = temp;
            System.out.println("아이디를 입력하세요");
            String teacherID2 = sc.next();
            String[] temp2 = new String[teacherID.length + 1];
            for (int d = 0; d < teacherID.length; d++) {
                temp2[d] = teacherID[d];
            }
            temp2[temp2.length - 1] = teacherID2;
            teacherID = temp2;
            System.out.println("비밀번호를 입력하세요");
            String teacherPW2 = sc.next();
            String[] temp3 = new String[teacherPW.length + 1];
            for (int p = 0; p < teacherPW.length; p++) {
                temp3[p] = teacherPW[p];
            }
            temp3[temp3.length - 1] = teacherPW2;
            teacherPW = temp3;
            idcnt += 1;
            System.out.println(teachername + "님 반갑습니다. (*´∀`*)");
            System.out.println("₍₍ ◝(・ω・)◟ ⁾⁾ 환영합니다.");
            System.out.println("현재 계정 수 : " + idcnt); // 확인용 계정 수
        }else{
            System.out.println("☆ 학생으로 회원 가입을 시작합니다 ☆");
            System.out.println("이름을 입력하세요");
            String studentname = sc.next();
            System.out.println("아이디를 입력하세요");
            String studentID = sc.next();
            System.out.println("비밀번호를 입력하세요");
            String studentPW = sc.next();
            idcnt += 1;
            System.out.println(studentname + "님 반갑습니다. (*´∀`*)");
            System.out.println("₍₍ ◝(・ω・)◟ ⁾⁾ 환영합니다.");
            System.out.println("현재 계정 수 : " + idcnt); // 확인용 계정 수
        }
        System.out.println(Arrays.toString(teacher));
        System.out.println(Arrays.toString(teacherID));
        System.out.println(Arrays.toString(teacherPW));
        System.out.println(Arrays.toString(student));
        System.out.println(Arrays.toString(studentID));
        System.out.println(Arrays.toString(studentPW));
    } // ok
//    public static void UserLogin() {
//        System.out.println("[* 아이디 : ]");
//        String UserID = sc.next();
//        System.out.println("[* 비밀번호 : ]");
//        String UserPW = sc.next();
//        int log = 0;
//        for (int i = 0; i < idcnt; i++) {
//            if (User[i].equals(UserID) && User[i].equals(UserPW)) {
//                log = i;
//                System.out.println(User[log] + "님이 로그인 하셨습니다");
//                System.out.println(User[Integer.parseInt(UserID)] + "님 반갑습니다. (*´∀`*)");
//                return;
//            } else {
//                System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
//                return;
//            }
//        }
//    }
//
//    // 아이디 찾기
//    public void UserPrint(String UserID) {
//        for (int i = 0; i < idcnt; i++) {
//            System.out.println(" (ง •̀ω•́)ง✧ 아이디만 보입니다.");
//            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
//            System.out.println(User[log].equals(UserID)) " 입니다."); // 아이디가 보이질않음
//            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
//        }
//    }

    //실행부
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idcnt = 0;
        String[] User = new String[0];

        int x = 0;
        System.out.println("=========================================");
        System.out.println("         # 성적 관리 프로그램 #");
        System.out.println("=========================================");
        System.out.println("계정이 없으면 회원가입 먼저 해주세요.");
        System.out.println("로그인 해주세요.");
        while (x == 0) {
            System.out.println("* 1. 회원가입 || * 2. 로그인 || * 3. 아이디찾기");
            System.out.println("* 4.계정 삭제 || * 5. 로그아웃|| * 6. 종료");
            int menu = sc.nextInt();
            if (menu == 1) {
                UserAdd(); //회원가입 함수
            } else if (menu == 2) {
//                UserLogin(); //로그인
            } else if (menu == 3) {
//                UserPrint(); //아이디보기
//            } else if (menu == 4) {
//                //UserLogin(); //로그인
//            } else if (menu == 5) {
//                //UserLogout(); //로그아웃함수
            } else {
                System.out.println(" (￣▽￣)ノ 종료합니다. ");
                break;
            }


        }

    }
}

