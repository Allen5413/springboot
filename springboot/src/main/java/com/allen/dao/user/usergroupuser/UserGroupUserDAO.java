package com.allen.dao.user.usergroupuser;

import com.allen.entity.user.UserGroupUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Allen on 2016/12/15 0015.
 */
public interface UserGroupUserDAO extends CrudRepository<UserGroupUser, Long> {

    /**
     * 通过UserId查询一个用户所属用户组
     * @param userId
     * @return
     */
    @Query("from UserGroupUser where userId = ?1")
    public List<UserGroupUser> findByUserId(long userId);
}
