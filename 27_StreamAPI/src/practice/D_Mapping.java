package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D_Mapping {
    /*
        매핑
        - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 함
     */
    public void method1(){
        int sum = 0;

        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 25, "남자", 80, 80)
        );

        // 학생들의 이름을 출력
        students.stream()
                .distinct()
                // .sorted() // 객체 타입을 정렬(오버라이딩한 compareTo에서 재정의한 순서대로 정렬함)
                // .map(student -> student.getName())
                .map(Student::getName)// String 리턴
                .sorted() // 기본 타입을 정렬
                // .forEach(value -> System.out.println(value));
                .forEach(System.out::println);
        System.out.println();

        // 학생들의 수학 점수의 합계
        sum = students.stream()
                .distinct()
                // .mapToInt(s -> s.getMath())
                .mapToInt(Student::getMath)
                .sum();

        System.out.println(sum);
        System.out.println();
    }

    public void method2(){
        int[] iNumber = {1,2, 3, 4, 5};
        double[] dNumber = {1.1, 2.2, 3.3, 4.4, 5.5};

        Arrays.stream(iNumber)
                .asDoubleStream()
                .forEach(System.out::println);
        System.out.println();

        // 중간 처리 메소드는 최종 처리 메소드가 호출되어야 동작함
        double sum = Arrays.stream(dNumber)
                            .boxed()
                            .sorted(Comparator.reverseOrder())
                            .mapToDouble(Double::doubleValue)
                            .sum();

        System.out.println(sum);
    }
}
