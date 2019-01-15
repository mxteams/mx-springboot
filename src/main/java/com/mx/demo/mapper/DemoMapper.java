package com.mx.demo.mapper;

import com.mx.demo.model.Demo;

import java.util.List;

/**
 * <p>
 * 部门表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2018-12-07
 */
public interface DemoMapper {

    /**
     * 获取ztree的节点列表
     */
    List<Demo> getAll();


}
