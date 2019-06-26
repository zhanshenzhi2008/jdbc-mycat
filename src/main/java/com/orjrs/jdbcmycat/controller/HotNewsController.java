package com.orjrs.jdbcmycat.controller;

import com.orjrs.jdbcmycat.model.HotNews;
import com.orjrs.jdbcmycat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 雇员控制层
 *
 * @author orjrs
 * @create 2019-06-26 20:01
 * @since 1.0.0
 */
@RestController
@RequestMapping("/orjrs")
public class HotNewsController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("get/{id}")
    public HotNews GetUser(@PathVariable Long id) {
        return employeeService.get(id);
    }
}
