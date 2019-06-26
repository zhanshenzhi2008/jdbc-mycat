package com.orjrs.jdbcmycat.mapper;

import com.orjrs.jdbcmycat.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 雇员服务接口
 *
 * @author orjrs
 * @create 2019-06-26 20:06
 * @since 1.0.0
 */
@Mapper
@Repository
public interface EmployeeMapper {
    Employee get(Long id);
}
