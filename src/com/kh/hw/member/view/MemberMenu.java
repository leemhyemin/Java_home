package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    //메인 메뉴 출력 메서드
    public void mainMenu() {

        while (true) {
            System.out.printf("\n# 최대 등록 가능한 회원 수는 %d명입니다.\n", mc.SIZE);
            int count = mc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다.\n", count);

            System.out.println("=============================================");

            if (count < mc.SIZE) {
                System.out.println("# 1. 새 회원 등록");
            }
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");

            System.out.printf("\n# 메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    printAll();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //프로그램 종료 메서드
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하세요.");
            }
        }
    }

    //1번메뉴 처리
    public void insertMember() {
        System.out.println("\n# 새 회원을 등록합니다.");

        String id = inputId();
        if (id == null) return;

        System.out.printf("- 이름: ");
        String name = sc.next();
        System.out.printf("- 비밀번호: ");
        String password = sc.next();
        System.out.printf("- 이메일: ");
        String email = sc.next();

        char gender = inputGender();

        System.out.printf("- 나이: ");
        int age = sc.nextInt();

        mc.insertMember(id, name, password, email, gender, age);
        System.out.println("\n # 회원가입 성공!");

    }

    //중복없는 아이디를 정확히 입력받아 리턴하는 메서드
    private String inputId() {
        int inputCount = 0;
        while (true) {
            if (inputCount == 3) {
                System.out.println("입력횟수 초과!");
                return null;
            }

            System.out.printf("- 아이디: ");
            String id = sc.next();

            if (!mc.checkId(id)) {
                if (mc.checkIdLength(id)) {
                    return id;
                }else{
                    System.out.println("#아이디는 3글자 이상 6글자 이하로~");
                }
            }else{
                System.out.println("# 중복된 아이디입니다. 다시 입력하세요.");
            }
            inputCount++;
        }
    }

    //성별을 정확히 입력받아 리턴하는 메서드
    private char inputGender() {
        while (true) {
            System.out.printf("- 성별(M/F): ");
            // toUpperCase(): 문자열을 전부 대문자로 변환
            // charAt(index): 문자열의 index 번 문자 1개를 char 타입으로 반환
            char gender = sc.next().toUpperCase().charAt(0);

            if (gender == 'M' || gender == 'F') {
                return gender;
            }
            System.out.println("# 성별을 다시 입력하세요.");
        }
    }

    //5번메뉴 처리
    public void printAll() {
        Member[] members = mc.printAll();
        int count = mc.existMemberNum();

        System.out.println("============== 전체 회원 정보 ================");
        for (int i = 0; i < count; i++) {
            System.out.println(members[i].inform());

        }
    }

    public void searchMember(){

        System.out.println("# 1. 아이디로 검색하기 ");
        System.out.println("# 2. 이름으로 검색하기");
        System.out.println("# 3. 이메일로 검색하기");
        System.out.println("# 9. 메인으로 돌아가기 '9' ");

        System.out.println("\n # 메뉴번회: ");
        int menu2 = sc.nextInt();

        switch (menu2){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                mainMenu();
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                mainMenu();
        }
    }

    /*
      검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
      mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
      검색 결과 없으면 "검색 결과가 없습니다." 출력 후 mainMenu()로 돌아감
      검색 결과가 있으면 "찾으신 회원 조회 결과입니다." 출력후
      회원 검색 결과 출력
     */

}
