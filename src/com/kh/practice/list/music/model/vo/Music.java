package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{

    public String title; //제목
    public String singer; // 가수이름

    public Music() {
    }

    public Music(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setTitle(){
        this.title = title;
    }
    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(title, music.title) && Objects.equals(singer, music.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, singer);
    }

    //정렬 기준 메서드
    public int compareTo(Music m){
        String m1 = this.title;
        String m2 = m.title;
        if (m1.equals(m2)) return 0;
        else if (m1.compareTo(m2) >= 1) return 1;
        else return -1;
    }

}
