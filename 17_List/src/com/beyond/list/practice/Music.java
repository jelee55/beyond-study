package com.beyond.list.practice;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;


public class Music implements Comparable<Music> {
    private String title;
    private String artist;
    private int ranking;

    public Music(String title, String artist, int ranking) {
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRanking() {
        return ranking;
    }

    /*
            compareTo()
            - 메소드에서 반환되는 값을 가지고 정렬 기준을 잡음
            - 비교해서 같으면 0을 리턴
            - 비교해서 자신이 크다면 양의 정수를 리턴
            - 비교해서 자신이 작다면 음의 정수를 리턴
         */
    @Override
    public int compareTo(Music music) {
        return this.ranking - music.ranking;
        // return music.ranking - this.ranking; // 내림차순 정렬
    }
}
