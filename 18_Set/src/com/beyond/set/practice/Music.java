package com.beyond.set.practice;


import java.util.Objects;

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

    // set 중복 제거하려면 equals, hashcode 추가
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        // 데이터가 같으면 true로 리턴
        return ranking == music.ranking && Objects.equals(title, music.title) && Objects.equals(artist, music.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ranking);
    }
}
