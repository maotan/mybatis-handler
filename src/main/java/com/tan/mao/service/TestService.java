package com.tan.mao.service;

import com.tan.mao.entity.DemoTable;
import com.tan.mao.mapper.DemoTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private DemoTableMapper demoTableMapper;

    public List<DemoTable> getList(){
        Example example=new Example(DemoTable.class);
        //example.createCriteria().andEqualTo("id", 1L);
        example.createCriteria().andEqualTo("id", 42L);
        List<DemoTable> list = demoTableMapper.selectByExample(example);
        return list;
    }
}
