package practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class F_Aggregate {
    /*
        기본 집계
        - 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할
          - count()
          - average()
          - max()
          - min()
          - findFirst()

        커스텀 집계
        - 기본 집계의 이외의 다양한 집계 결과물을 산출하는 역할을 함
            - reduce()
        
        Optional 클래스
        - 스트림의 최종 결과 값을 저장하는 객체
        - 단순히 값만 저장하는 것 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우
          기본 값을 설정할 수 있는 객체
        
     */
    public void method1(){
        int[] numbers = {1, 2, 3, 4, 5, 6};
        // int[] numbers = {1, 3, 5};

        // 1. 기본 집계
        long count = Arrays.stream(numbers)
                            .filter(number -> number % 2 == 0)
                            .count();
        System.out.printf("2의 배수의 개수 : %d\n", count);



        int sum = Arrays.stream(numbers)
                        .filter(number -> number % 2 == 0)
                        .sum();
        System.out.printf("2의 배수의 합 : %d\n", sum);



        OptionalDouble optionalDouble = Arrays.stream(numbers)
                                                .filter(number -> number % 2 == 0)
                                                .average();
        // Optional 객체에 저장된 값을 가져옴
        // System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.getAsDouble());
        
        // System.out.printf("2의 배수 : %b\n", optionalDouble.isPresent());
        
        // isPresent() 메소드로 값의 존재 여부를 확인할 수 잇음
        // if (optionalDouble.isPresent()) {
        //     System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.getAsDouble());
        // }else{
        //     System.out.println("2의 배수의 평균은 : 0");
        // }

        // ifPresent() 메소드는 집계 값을 처라히는 Consumer를 등록함(단, 값이 존재해야 실행)
        // optionalDouble.ifPresent(value -> System.out.printf("2의 배수의 평균 : %.1f\n", value));

        // orElse() 메소드는 get() 메소드와 동일하게 저장되어 있는 값을 얻어오는 메소드
        // 단, 값이 저장되어 있지 않을 경우 리턴받을 디폴드 값을 지정할 수 있음
        System.out.printf("2의 배수의 평균 : %.1f\n",optionalDouble.orElse(0.0));


        OptionalInt optionalInt = Arrays.stream(numbers)
                                        .filter(number -> number % 2 == 0)
                                        .min();
        System.out.printf("2의 배수의 최소값 : %d\n", optionalInt.orElse(0));

        optionalInt = Arrays.stream(numbers)
                            .filter(number -> number % 2 == 0)
                            .max();
        System.out.printf("2의 배수의 최대값 : %d\n", optionalInt.orElse(0));


        optionalInt = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .findFirst();
        System.out.printf("2의 배수의 첫 번째 요소의 값 : %d\n", optionalInt.orElse(0));

        optionalInt = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .findAny();
        System.out.printf("2의 배수의 요소들 중 아무값 : %d\n", optionalInt.orElse(0));


        // 2. 커스텀 집계
        // 2의 배수의 곱
         Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .reduce((left, right) -> left * right)
                .ifPresent(value -> System.out.printf("2의 배수의 곱 : %d\n", value));
    }
}
