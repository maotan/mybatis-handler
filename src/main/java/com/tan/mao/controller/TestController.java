package com.tan.mao.controller;

import com.tan.mao.domain.enums.TeacherType;
import com.tan.mao.entity.DemoTable;
import com.tan.mao.entity.Student;
import com.tan.mao.entity.Teacher;
import com.tan.mao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<DemoTable> getList(){
        return testService.getList();
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return testService.save(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student save(@PathVariable("id") Long id) {
        Student st = testService.get(id);
        return st;
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public Teacher save() {
        Teacher teacher = new Teacher();
        teacher.setName("王是一");
        teacher.setAge(36);
        teacher.setType(TeacherType.HIGH);
        return testService.save(teacher);
    }

    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
    public Teacher getById(@PathVariable("id") Long id) {
        Teacher tea = testService.getTeacherById(id);
        return tea;
    }

}
