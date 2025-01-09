package com.beyond.inherit.practice;

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
    public String information(){
        return String.format(super.information() + ", modelAgench : %s \n", modelAgench);
    }
//    @Override
//    public String information(){
//        return String.format("code: %s, name: %s, brand: %s, price: %d, allInOne: %b\n", getCode(), getName(), getBrand(), getPrice(), modelAgench);
//    }


}
