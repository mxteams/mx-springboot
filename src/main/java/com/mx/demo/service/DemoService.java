package com.mx.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.demo.mapper.DemoMapper;
import com.mx.demo.model.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DemoService extends ServiceImpl<DemoMapper, Demo> {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> getAll(Demo demo) {


        return this.getAll(demo);

    }


}
