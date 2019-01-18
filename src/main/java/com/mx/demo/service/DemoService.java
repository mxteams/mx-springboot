package com.mx.demo.service;

import com.mx.demo.mapper.DemoMapper;
import com.mx.demo.model.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DemoService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    //@Resource
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> getAll(Demo demo) {
        log.info("我是info");
        return demoMapper.getAll();

    }

}
