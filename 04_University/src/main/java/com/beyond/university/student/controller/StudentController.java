package com.beyond.university.student.controller;

import com.beyond.university.department.model.dto.DepartmentsDto;
import com.beyond.university.department.model.service.DepartmentService;
import com.beyond.university.student.model.service.StudentService;
import com.beyond.university.student.model.vo.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final DepartmentService departmentService;

    @GetMapping("/student/search")
    public ModelAndView search(ModelAndView modelAndView,
                                @RequestParam(required = false) String deptNo) {
        List<DepartmentsDto> departments =
                departmentService.getDepartments()
                        .stream()
//                        .map(department -> new DepartmentsDto(department.getNo(), department.getName()))
                        .map(DepartmentsDto::new)
                        .toList();

        log.info("departments.size() : {}", departments.size());

        if(deptNo != null){
            List<Student> students = studentService.getStudentsByDeptNo(deptNo);

            System.out.println(students);
            System.out.println(students.size());

            modelAndView.addObject("students", students);

        }

//        System.out.println(departments);
//        System.out.println(departments.size());


        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("student/search");

        return modelAndView;
    }
}
