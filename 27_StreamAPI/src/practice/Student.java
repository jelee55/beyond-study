package practice;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Student implements Comparable<Student> {
    @NonNull
    private String name;
    @NonNull
    private int age;
    private String gender;
    private int math;
    private int english;


    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }

    public int getSum(){
        return this.math + this.english;
    }

    public int getAvg(){
        return getSum()/ 2;

    }


}
