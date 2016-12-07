package com.allen.dao;

import com.allen.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Allen on 2016/12/8 0008.
 */
public interface DemoDAO extends CrudRepository<Demo, Long> {
}
