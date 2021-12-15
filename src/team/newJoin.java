package team;


import java.util.Arrays;
import java.util.Scanner;

public class newJoin {

   /* 성적 관리 프로그램
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
        #학교 규칙*/

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
            System.out.println("* 1. 회원가입 || * 2. 로그인 || * 3. 로그아웃 || * 4. 종료");
            int menu = sc.nextInt();
            if (menu == 1) {
                UserAdd(); //회원가입 함수
            } else if (menu == 2) {
                UserLogin(); //로그인
            } else if (menu == 3) {
                UserLogout(); //로그아웃함수
            } else {
                System.out.println(" (￣▽￣)ノ 종료합니다. ");
                break;
            }
        }
    }
    //회원가입 함수
    public static void UserAdd() {
        System.out.println("* 1. 선생님 || * 2. 학생 ||");
        int JoinMenu = sc.nextInt();
        if (JoinMenu == 1) {
            //선생님 회원가입
            System.out.println("☆ 선생님으로 회원 가입을 시작합니다 ☆");
            System.out.println("이름을 입력하세요");
            String teacherName = sc.next();
            String[] temp = new String[teacher.length + 1];
            for (int i = 0; i < teacher.length; i++) {
                temp[i] = teacher[i];
            }
            temp[temp.length - 1] = teacherName;
            teacher = temp;
            System.out.println("아이디를 입력하세요");
            String teacherID2 = sc.next();
            String[] temp2 = new String[teacherID.length + 1];
            for (int d = 0; d < teacherID.length; d++) {
                for (int i = 0; i < idcnt; i++) {
                    if (teacherID[i].equals(teacherID2)) {
                        System.out.println("사용중인 아이디입니다. 다른 아이디를 입력해주세요.");
                        return; // 다시 회원가입.
                    }
                }
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
            System.out.println(teacherName + "선생님 반갑습니다. (*´∀`*)");
            System.out.println("₍₍ ◝(・ω・)◟ ⁾⁾ 환영합니다.");
            System.out.println("현재 계정 수 : " + idcnt); // 확인용 계정 수
        } else {
            //학생 회원가입
            System.out.println("☆ 학생으로 회원 가입을 시작합니다 ☆");
            System.out.println("이름을 입력하세요");
            String studentName = sc.next();
            String[] temp4 = new String[student.length + 1];
            for (int z = 0; z < student.length; z++) {
                temp4[z] = student[z];
            }
            temp4[temp4.length - 1] = studentName;
            student = temp4;
            System.out.println("아이디를 입력하세요");
            String studentID2 = sc.next();
            String[] temp5 = new String[studentID.length + 1];
            for (int f = 0; f < studentID.length; f++) {
                for (int x = 0; x < idcnt; x++) {
                    if (studentID[x].equals(studentID2)) {
                        System.out.println("사용중인 아이디입니다. 다른 아이디를 입력해주세요.");
                        return; //다시 회원가입
                    }
                }
                temp5[f] = student[f];
            }
            temp5[temp5.length - 1] = studentID2;
            studentID = temp5;
            System.out.println("비밀번호를 입력하세요");
            String studentPW2 = sc.next();
            String[] temp6 = new String[studentPW.length + 1];
            for (int s = 0; s < studentPW.length; s++) {
                temp6[s] = student[s];
            }
            temp6[temp6.length - 1] = studentPW2;
            studentPW = temp6;

            idcnt += 1;
            System.out.println(studentName + "학생 ! 반갑습니다. (*´∀`*)");
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

    // 로그인
    public static void UserLogin() {
        System.out.println("[* 아이디 : ]");
        String UserID = sc.next();
        System.out.println("[* 비밀번호 : ]");
        String UserPW = sc.next();
        int log = 0;
        for (int i = 0; i < teacher.length; i++) {
            if (teacherID[i].equals(UserID) && teacherPW[i].equals(UserPW)) {
                log = i;
                System.out.println(teacher[log] + "선생님이 로그인 하셨습니다.");
                System.out.println(teacher[log] + "님 반갑습니다. (*´∀`*)");
                return;
            }
        }
            for (int j = 0; j < student.length; j++) {

                if (studentID[j].equals(UserID) && studentPW[j].equals(UserPW)) {
                    log = j;
                    System.out.println(student[log] + "학생이 로그인하였습니다.");
                    System.out.println(student[log] + "님 반갑습니다. (*´∀`*)");
                    return;
                }
            }
        System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
        return;
    }

    static void UserLogout(){
        System.out.println("[* 아이디: ]");
        String id = sc.next();
        System.out.println("[* 비밀번호: ]");
        String pw = sc.next();
        int log;
        for (int i = 0; i < idcnt; i++) {
            if (teacherID[i].equals(id) && teacherPW[i].equals(pw)) {
                log = i;
                System.out.println(teacher[log] + "님이 로그아웃 하셨습니다.(｡•́︿•̀｡) ");
            }
        }
    }
}
