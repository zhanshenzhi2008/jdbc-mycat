package com.orjrs.jdbcmycat.service.impl;

import com.orjrs.jdbcmycat.mapper.HotNewsMapper;
import com.orjrs.jdbcmycat.model.HotNews;
import com.orjrs.jdbcmycat.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 雇员服务实现类
 *
 * @author orjrs
 * @create 2019-06-26 20:10
 * @since 1.0.0
 */
@Service
public class HotNewsServiceImpl implements EmployeeService {

    @Resource
    private HotNewsMapper hotNewsMapper;

    @Override
    public HotNews get(Long id) {
        return hotNewsMapper.get(id);
    }
}
