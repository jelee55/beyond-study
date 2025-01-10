package com.beyond.inter.practice;

public class SmartPhone extends Product {
    private String modelAgench; // 통신사

    public SmartPhone(){

    }

    public SmartPhone(String code, String name, String brand, int price, String modelAgench) {
        super(code, name, brand, price);
        this.modelAgench = modelAgench;
    }


    public String getModelAgench() {
        return modelAgench;
    }

    public void setModelAgench(String modelAgench) {
        this.modelAgench = modelAgench;
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone turn off");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "modelAgench='" + modelAgench + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
