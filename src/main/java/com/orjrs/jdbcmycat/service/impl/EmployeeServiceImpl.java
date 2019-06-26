package com.orjrs.jdbcmycat.service.impl;

import com.orjrs.jdbcmycat.model.Employee;
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
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeService employeeService;

    @Override
    public Employee get(Long id) {
        return employeeService.get(id);
    }
}
