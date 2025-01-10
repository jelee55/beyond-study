package com.beyond.polymorphism.practice;

public class Desktop extends Product{
    private boolean allInOne; // 일체 여부

    public Desktop(){
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {


        this.code = code;
        this.name = name;
        super.brand = brand;
        super.price = price;

        this.allInOne = allInOne;
    }


    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }


    @Override
    public String toString() {
        return "Desktop{" +
                "allInOne=" + allInOne +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
