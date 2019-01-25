package com.tan.mao.mapper;

import com.tan.mao.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends CommMapper<Student> {
    int save(Student student);
    Student get(Long id);
}