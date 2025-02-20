package com.beyond.university.student.model.service;

import com.beyond.university.student.model.mapper.StudentMapper;
import com.beyond.university.student.model.vo.Student;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;
    @Override
    public List<Student> getStudentsByDeptNo(String deptNo) {
        return  studentMapper.selectAllByDeptNo(deptNo);
    }

    @Override
    public Student getStudentByNo(String sno) {
        return studentMapper.selectStudentByNo(sno);
    }

    @Override
    @Transactional
    public int save(Student student) {
        int result = 0;
        System.out.println("save serviceimpl no" + student.getNo());


        if (student.getNo() != null) {
            // update
            result = studentMapper.updateStudent(student);

        }else {
            // insert
            result = studentMapper.insertStudent(student);

        }

        return result;
    }

    @Override
    public int delete(String sno) {
        return studentMapper.deleteStudent(sno);
    }
}
