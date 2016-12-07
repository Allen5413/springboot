package com.allen.dao.impl;

import com.allen.entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Allen on 2016/12/8 0008.
 */
@Repository
public class DemoDAOImpl {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id获取demo对象.
     * @param id
     * @return
     */

    public Demo getById(long id){
        String  sql = "select * from demo where id=?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }


}
