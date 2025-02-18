package com.beyond.university.student.model.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String no;

    private String deptNo;

    private String name;

    private String ssn;

    private String address;

    private LocalDate entranceDate;

    private String absenceYn;

    private String coachProfessorNo;
}
