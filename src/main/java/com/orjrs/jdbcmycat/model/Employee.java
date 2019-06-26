package com.orjrs.jdbcmycat.model;

import java.util.Date;

/**
 * 雇员实体
 *
 * @author orjrs
 * @create 2019-06-26 20:08
 * @since 1.0.0
 */
public class Employee {
    /** 主键 */
    private Long id;

    /** 员工id */
    private String userId;

    /** 日期 */
    private Date date;

    /** 费用 */
    private String fee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
