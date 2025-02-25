package com.beyond.university.department.model.service;

import com.beyond.university.department.model.mapper.DepartmentMapper;
import com.beyond.university.department.model.vo.Department;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentMapper departmentMapper;

    @Override
    public int getTotalCount(String openYn) {
        return departmentMapper.selectDepartmentsCount(openYn);
    }

    @Override
    public List<Department> getDepartments(int page, int numOfRows, String openYn) {

        /*
            마이바티스에서 페이징 처리

            마이바티스에서는 페이징 처리 위해 RowBounds라는 클래스를 제공해 줌
            RowBounds의 객체를 생성할 때 offset limit 값을 전달해서 페이징 처리를 쉽게 구현함
            (offset 만큼 건더뛰고 limit 만큼 가져옴)

            offset = 0, limit = 10
                - 0개를 건너뛰고 10개를 가져옴(1~10)

            offset = 10, limit = 10
                - 10개를 건너뛰고 10개를 가져옴(11~20)

            offset = 20, limit = 10
                - 20개를 건너뛰고 10개를 가져옴(21~30)
         */
        int limit = numOfRows;
        int offset = (page - 1) * limit;
        RowBounds rowBounds = new RowBounds(offset, limit);
//        if (true){
//            throw new RuntimeException("서브스 실행중 에러 발생");
//        }

        return departmentMapper.selectAll(openYn,rowBounds);
    }

    @Override
    public Optional<Department> getDepartmentByNo(String deptNo) {
        return departmentMapper.selectDepartmentByNo(deptNo);
    }

    @Override
    @Transient
    public void save(Department department) {
        if (department.getNo() != null) {
            // update
            departmentMapper.updateDepartment(department);
        }else{
            // insert
            departmentMapper.insertDepartment(department);
        }
    }

    @Override
    @Transient
    public void delete(String deptNo) {
        departmentMapper.deleteDepartment(deptNo);
    }





}
