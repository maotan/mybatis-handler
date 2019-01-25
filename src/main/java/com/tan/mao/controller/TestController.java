package com.tan.mao.controller;

import com.tan.mao.entity.DemoTable;
import com.tan.mao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
