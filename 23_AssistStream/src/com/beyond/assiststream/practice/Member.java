package com.beyond.assiststream.practice;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {
    @Serial
    private static final long serialVersionUID = -4996775473190754474L;
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;
    private double point;

    public Member(String id, String password, String name, int age, char gender, double point) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
