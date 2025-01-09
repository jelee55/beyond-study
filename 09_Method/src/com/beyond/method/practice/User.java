package com.beyond.method.practice;

public class User {
    private  String id;
    private  String password;
    private  String name;

    public User(){}
    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String infomation() {
    return String.format("id:%s, password:%s, name:%s", id, password, name);
    }
}