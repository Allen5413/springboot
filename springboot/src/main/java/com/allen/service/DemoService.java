package com.allen.service;

import com.allen.dao.DemoDAO;
import com.allen.dao.impl.DemoDAOImpl;
import com.allen.entity.Demo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Allen on 2016/12/8 0008.
 */
@Service
public class DemoService {
    @Resource
    private DemoDAO demoDAO;
    @Resource
    private DemoDAOImpl demoDAOImpl;

    @Transactional
    public void save(Demo demo){
        demoDAO.save(demo);
    }

    public Demo getById(long id){
        return demoDAOImpl.getById(id);
    }
}
