package com.tan.mao.controller;

import com.tan.mao.entity.DemoTable;
import com.tan.mao.entity.Student;
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

}
