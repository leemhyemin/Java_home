package day20.file.io;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        //디렉토리를 생성하는 코드

        //만들 폴더 정보 객체 생성
        File f = new File("D:/human");
        if (!f.exists()) f.mkdirs(); //make directories

    }
}
