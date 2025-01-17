package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_Filtering {
    /*
        필터링
        - 필터링은 중간 처리 기능으로 요소를 걸러내는 역할
        - distinct() 메소드는 요소의 중복을 제거하는 메소드
        - filter(Predicate) 메소드는 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거
     */

    // 중복 제거
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 25, "남자", 80, 80)
        );


        // stream 참조 변수에 담지 않고 list로 부터 바로 사용
        Stream<Student> stream =  students.stream();
        // stream.forEach(student -> System.out.println(student));
        stream.forEach(System.out::println);
        System.out.println();
        // 이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없음
        // 리스트로부터 스트림을 다시 얻어야 함
        // stream.forEach(student -> System.out.println(student));
        // stream.distinct().forEach(System.out::println);

        // distinct() -> 중복 제거를 하려면EqualsAndHashCode 재정의 해줘야함
        students.stream().distinct().forEach(System.out::println);
    }

    // 필터 메소드
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 25, "남자", 80, 80)
        );

        // 성별이 여자인 학생만 출력
        students.stream()
                .distinct()  //중복 제거
                .filter(s -> s.getGender().equals("여자")) // true만 반환
                .forEach(System.out::println);
        System.out.println();

        // 수학, 영어 점수가 둘다 60점 이상인 학생만 출력
        students.stream()
                .distinct()
                .filter(s ->  s.getMath()>= 60 && s.getEnglish() >= 60 )
                .forEach(System.out::println);
        System.out.println();
    }

}
