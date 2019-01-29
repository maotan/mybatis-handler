package com.tan.mao.mapper;

import com.tan.mao.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper extends CommMapper<Teacher> {
    int save(Teacher teacher);
    Teacher get(Long id);
}