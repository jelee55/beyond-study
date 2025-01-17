package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class G_Collect {
    /*
        수집
        - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 잇음.
     */
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("이몽룡", 25, "남자", 80, 80),
                new Student("성춘향", 20, "여자", 100, 100)
        );

        // 학생들의 이름만 List 컬렉션을 추철
        List<String> name = students.stream()
                                    .map(Student::getName)
                                    .collect(Collectors.toList());
        System.out.println(name);
        System.out.println();

        
        // 남학생들만 List 컬렉션으로 추출
        List<Student> list = students.stream()
                .filter(s -> s.getGender().equals("남자"))
                .toList();
        list.forEach(System.out::println);
        System.out.println();
        
        // 여학생들만 Set 컬렉션으로 추출
        Set<Student> set = students.stream()
                .filter(s -> s.getGender().equals("여자"))
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println();


        // Map 컬렉션으로 수집 (key: 이름, value: Student
        Map<String, Student> map = students.stream()
                // .collect(Collectors.toMap(s -> s.getName(), s -> s));
                .collect(Collectors.toMap(Student::getName, Function.identity()));


        map.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println();

        Map<String, List<Student>> listMap = students.stream()
                .collect(Collectors.groupingBy(Student::getName));

        listMap.forEach((s, studentList) -> {
            System.out.println(s);
            studentList.forEach(System.out::println);
            System.out.println();
        });




    }
}
