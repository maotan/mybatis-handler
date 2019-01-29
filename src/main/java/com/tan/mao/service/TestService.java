package com.tan.mao.service;

import com.tan.mao.entity.DemoTable;
import com.tan.mao.entity.Student;
import com.tan.mao.entity.Teacher;
import com.tan.mao.mapper.StudentMapper;
import com.tan.mao.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    public List<DemoTable> getList(){
        Example example=new Example(DemoTable.class);
        //example.createCriteria().andEqualTo("id", 1L);
        example.createCriteria().andEqualTo("id", 42L);
        //List<DemoTable> list = demoTableMapper.selectByExample(example);
        return null;
    }

    public Student save(Student student) {
        studentMapper.save(student);
        return student;
    }

    public Student get(Long id) {
        return studentMapper.get(id);
    }

    public Teacher save(Teacher teacher) {
        teacherMapper.save(teacher);
        return teacher;
    }
    public Teacher getTeacherById(Long id) {
        return teacherMapper.get(id);
    }
}
