package com.beyond.lambda.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    
    // final @NonNull 을 붙이면  해당 필드를 매개변수를 같는 생성자를 만드는 것
    // private final String name;
    @NonNull
    private String name;
    @NonNull
    private int age;
    private String gender;
    private int math;
    private int english;


    public int getSum(){
        return math + english;
    }

    public int getAvg(){
        return getSum() / 2;
    }


}
