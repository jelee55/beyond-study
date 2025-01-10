package com.beyond.polymorphism.practice;

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
