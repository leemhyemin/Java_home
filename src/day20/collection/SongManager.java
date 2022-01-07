package day20.collection;

import java.util.*;

public class SongManager {

    private static Map<String, Set<String>> artistMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    insertMusic();
                    break;
                case 2:
                    searchMusic();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }

        }//end while

    }//end main

    //등록처리
    private static void insertMusic() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        System.out.printf("- 가수명: ");
        String singer = sc.nextLine();

        System.out.printf("- 곡명: ");
        String song = sc.nextLine();
        
        //신규 가수인가?
        if (!artistMap.containsKey(singer)) { // 신규 가수
            Set<String> newSongList = new HashSet<>();
            newSongList.add (song); //노래추가
            artistMap.put(singer, newSongList); //맵에 키와 벨류 입력
            System.out.printf("# 아티스트 %s님이 신규 등록되었습니다.\n",singer);
        } else { //기존 등록가수
            //해당 가수의 노래 목록을 참조
            Set<String> songList = artistMap.get(singer);
            if (songList.add(song)) {
                System.out.printf("%s 님의 노래목록에 '%s' 곡이 추가되었습니다.\n", singer, song);
            } else {
                System.out.println("# 이미 등록된 노래입니다.");
            }
        } 
    }

    //검색처리
    private static void searchMusic() {
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        System.out.printf("- 가수명: ");
        String singer = sc.nextLine();

        //등록된 가수인가?
        if (artistMap.containsKey(singer)) {
            System.out.printf("\n# %s님의 노래목록\n", singer);
            System.out.println("===========================================================");

            int sequence = 1; //노래곡번호
            for (String title : artistMap.get(singer)) {
                System.out.printf("* %d. %s\n", sequence++, title);
            }

        } else {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }
    }

    //메뉴를 출력하는 메서드
    private static void showMenu() {
        System.out.println("\n\n**** 음악 관리 프로그램 ****");
        System.out.printf("# 현재 등록된 가수: %d명\n", artistMap.size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("===============================");
    }

}