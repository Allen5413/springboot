package com.allen.dao.user.usergroup;

import com.allen.entity.user.UserGroup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Allen on 2016/12/15 0015.
 */
public interface UserGroupDAO extends CrudRepository<UserGroup, Long> {
}
