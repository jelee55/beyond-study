package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class C_Sort {
    /*
        정렬
        - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬할 수 있음
        - IntStream, LongStream, DoubleSream은 요소를 오름차순으로 정렬
        - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있음
     */

    // 요소가 기본 자료형일 때
    public void method1(){
        // 오름차순 정렬
        IntStream.of(3, 5, 1, 4, 1)
                .sorted()  // 정렬
                .forEach(value -> System.out.print(value + " "));
        System.out.println();

        // 내림차순 정렬ㄹ
        IntStream.of(3, 5, 1, 4, 1)
                .boxed()
                .sorted(Comparator.reverseOrder())
                // .mapToInt(Integer::intValue) // 숫자 타입으로 변환
                .forEach(value -> System.out.print(value + " "));
        System.out.println();

    }

    // 요소가 객체일 때
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 25, "남자", 80, 80)
        );

        // 오름차순 정렬
        students.stream()
                .distinct()
                // .sorted()
                // .sorted(((o1, o2) -> o1.compareTo(o2)))
                .sorted((Student::compareTo))
                // .sorted(Comparator.comparing(Student::getName)) // 기본형과 달리 정렬 기준을 지정해줘야 함
                .forEach(System.out::println);
        System.out.println();

        // 내림차순 정렬
        students.stream()
                .distinct()
                // .sorted(Comparator.reverseOrder())
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);
    }
}
