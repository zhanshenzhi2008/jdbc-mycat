package com.orjrs.jdbcmycat.service;

import com.orjrs.jdbcmycat.model.HotNews;

/**
 * 雇员服务接口
 *
 * @author orjrs
 * @create 2019-06-26 20:06
 * @since 1.0.0
 */
public interface EmployeeService {
    HotNews get(Long id);
}
