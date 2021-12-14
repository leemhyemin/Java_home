package team;
import java.util.Objects;
import java.util.Scanner;
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
class User{
    String id; // 객체의 id가 저장되는곳
    String pw; // 객체의 pw가 저장되는곳
    //클래스
    // ex동물에 대한 class
    // 애니멀 .키
    //애니멀 . 몸무게
    // 애니멀 ...
    // 각자의 변수와 배열들로 저장을 해서 포문 돌릴때도 배열들어가는데
    // 이걸 조금더 간단하고 컴퓨터 입장에서도 처리 속도가 빠르게
    // 클래스를 쓴다면 애니멀[] 해놓고 쓸수있음.!
    // 클래스는 객체를 위한 틀
    // 오브젝트 객체
}
class UserManger{
    static Scanner sc = new Scanner(System.in);
    static User[] user = null; //객체 생성 초기화역활
    static int idcnt = 0;

    // 프로그램메인 로그인후 넘어가기.
    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {


            //회원가입
    //객체의 동작에 해당하는 실행 블록
    static void UserAdd(){
        System.out.println("☆ 회원 가입을 시작합니다 ☆");
        if(idcnt == 0){
            user = new User[1];
        }else {
            User[] temp = user; // 객체 활용
            user = new User[idcnt + 1];
            for (int i = 0; i < idcnt; i++) {
                user[i] = temp[i];
            }
        }
        user[idcnt] = new User();
        System.out.println("아이디를 입력하세요");
        String memberid = sc.next();
        for (int i = 0; i < idcnt; i++) {
            if (user[i].id.equals(memberid)){
                System.out.println("사용중인 아이디입니다. 다른 아이디를 입력해주세요.");
                UserAdd(); // 다시 회원가입.
            }
        }
        System.out.println("사용 하실 수 있는 아이디입니다.");
        System.out.println("비밀번호를 입력하세요");
        String memberpw = sc.next();
        while (true) {
            System.out.println("비밀번호를 재입력해주세요.");
            String memberpwqw = sc.next();
            if (Objects.equals(memberpw, memberpwqw)) {
                System.out.println("일치 합니다.");
                break;
            }
        }
        user[idcnt].id = memberid;
        user[idcnt].pw = memberpw;
        idcnt += 1;
        System.out.println(memberid + "님 반갑습니다. (*´∀`*)");
        System.out.println("₍₍ ◝(・ω・)◟ ⁾⁾ 환영합니다.");
        System.out.println("현재 계정 수 : " + idcnt); // 확인용
    }
    // 회원탈퇴
    static void UserDel(){
        System.out.println("삭제할 아이디를 입력하세요");
        int index = -1;
        String delid = sc.next();
        System.out.println("삭제할 비밀번호를 입력하세요");
        String delpw = sc.next();
        for (int i = 0; i < idcnt; i++) {
            if(delid.equals(user[i].id) && delpw.equals(user[i].pw)){
                index = i;
                User temp2[] = new User[idcnt -1 ];
                for (int k = 0; k  < idcnt - 1; k ++) {
                    if(k < index){
                        temp2[k] = user[k];
                    }else if(k >= index) {
                        temp2[k] = user[k + 1];
                    }
                }
                user = temp2;
                idcnt -= 1;
                System.out.println("삭제가 완료되었습니다. ₍₍ (ง ˙ω˙)ว ⁾⁾ ");
                System.out.println("현재 계정 수 : " + idcnt); // 확인용
                return;
            }
        }
    }
    // 아이디 찾기
    static void UserPrint(){
        for (int i = 0; i < idcnt; i++) {
            System.out.println(" (ง •̀ω•́)ง✧ 아이디만 보입니다.");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println(">> " + user[i].id + " 입니다.");
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
                return;
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