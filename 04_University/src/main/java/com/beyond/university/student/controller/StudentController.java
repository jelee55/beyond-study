package com.beyond.university.student.controller;

import com.beyond.university.department.model.dto.DepartmentsDto;
import com.beyond.university.department.model.service.DepartmentService;
import com.beyond.university.student.model.dto.StudentRegisterRequestDto;
import com.beyond.university.student.model.dto.StudentUpdateRequestDto;
import com.beyond.university.student.model.dto.StudentsDto;
import com.beyond.university.student.model.service.StudentService;
import com.beyond.university.student.model.vo.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
            List<StudentsDto> students =
                    studentService.getStudentsByDeptNo(deptNo)
                            .stream()
                            .map(StudentsDto::new)
                            .toList();

            log.info("students.size() : {}", students.size());

            modelAndView.addObject("students", students);

        }

        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("student/search");

        return modelAndView;
    }


    @GetMapping("/student/info")
    public ModelAndView info(ModelAndView modelAndView, @RequestParam String sno){

        Student student = studentService.getstudentByNo(sno);

        List<DepartmentsDto> departments =
                departmentService.getDepartments()
                        .stream()
                        .map(DepartmentsDto::new)
                        .toList();


        System.out.println(student);
        modelAndView.addObject("student", student);
        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("student/info");

        return modelAndView;
    }

    @GetMapping("/student/register")
    public ModelAndView register(ModelAndView modelAndView){
        List<DepartmentsDto> departments =
                departmentService.getDepartments()
                        .stream()
                        .map(DepartmentsDto::new)
                        .toList();


        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("student/register");
        return modelAndView;
    }

    @PostMapping("/student/register")
    public ModelAndView register(ModelAndView modelAndView, StudentRegisterRequestDto requestDto){
        int result = 0;

        Student student = requestDto.toStudent();

        result = studentService.save(student);

        log.info("student : {}", student);

        if (result > 0){
            modelAndView.addObject("msg", "학생이 등록 성공");
            modelAndView.addObject("location", "/student/info?sno=" + student.getNo());
        }else {
            modelAndView.addObject("msg", "학생이 등록 실패");
            modelAndView.addObject("location", "/student/register");
        }

        modelAndView.setViewName("common/msg");

        return modelAndView;
    }
    @PostMapping("/student/update")
    public ModelAndView update(ModelAndView modelAndView, StudentUpdateRequestDto requestDto){

        int result = 0;
        Student student = requestDto.toStudent();
        result = studentService.save(student);

        if (result > 0){
            modelAndView.addObject("msg", "학생이 수정 성공");
        }else {
            modelAndView.addObject("msg", "학생이 수정 실패");
        }

        modelAndView.addObject("location", "/student/info?sno=" + student.getNo());
        modelAndView.setViewName("common/msg");


        return modelAndView;
    }

    @PostMapping("/student/delete")
    public ModelAndView delete(ModelAndView modelAndView, @RequestParam String sno){
        int result = 0;

        result = studentService.delete(sno);
        if (result > 0){
            modelAndView.addObject("msg","삭제 성공");
            modelAndView.addObject("location", "/student/search");
        }else{
            modelAndView.addObject("msg","삭제 실패");
            modelAndView.addObject("location", "/student/info?sno=" + sno);
        }
        modelAndView.setViewName("common/msg");
        return modelAndView;
    }
}
