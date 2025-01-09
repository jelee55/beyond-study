package com.beyond.inherit.practice;

public class Product {
    protected String code; // 상품 코드
    protected String name; // 상품 이름
    protected String brand; // 브랜드
    protected int price; // 상품 가격

    public Product(){
        System.out.println("부모 클래스의 기본 생성자 호출");
    }
    public Product(String code, String name, String brand, int price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String information(){
        return String.format("code : %s, name: %s, brand : %s, price : %d", code, name, brand, price);
    }
}
