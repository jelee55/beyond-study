package com.beyond.inherit.practice;

public class Desktop extends Product{
    private boolean allInOne; // 일체 여부

    public Desktop(){
        // super(); 생략 가능 super는 부모이 생성자를 호출한다는 의미 // 인스턴스라는 객체를 생성할 때만 사용할 수 있음
        System.out.println("자식 클래스의 기본 생성자 호출1");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        System.out.println("자식 클래스의 기본 생성자 호출2");

        // 부모 필드를 초기화 할 수 있는 방법
        // 1) 부모의 생성자를 호출해서 초기화
        // super(code, name, brand, price);

        // 2) 부모의 Setter 메소드(public이기 때문에 this, super, 생략 가능)를 호출해서 초기화
        // setCode(code);
        // this.setName(name); // this 객체 자기자신을 참조 주소값
        // super.setBrand(brand); // super 부모 참조 주소값
        // super.setPrice(price);
        
        // 3) 부모의 필드에 직접 접근해서 초기화 (protected 접근 제한자 사용)
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

//    @Override
//    public String information(){
//        return String.format("code: %s, name: %s, brand: %s, price: %d, allInOne: %b\n", code, name, brand, price, allInOne);
//    }

    @Override
    public String information(){
        return String.format("%s, allInOne: %b\n", super.information(), allInOne);
//        return String.format(super.information()+", allInOne : %b\n",  allInOne);
    }
}
