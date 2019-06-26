package com.orjrs.jdbcmycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.orjrs.jdbcmycat.mapper")
public class JdbcMycatApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcMycatApplication.class, args);
    }

}
