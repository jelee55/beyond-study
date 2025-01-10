package com.beyond.inter.practice;

public class Television extends Product{
    private int inch; // 인치


    public Television(){

    }
    public Television(String code, String name, String brand, int price, int inch) {
        this.setCode(code);
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public void turnOn(){
        System.out.println("Television turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("Television turned off");
    }

    @Override
    public String toString() {
        return "Television{" +
                "inch=" + inch +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
