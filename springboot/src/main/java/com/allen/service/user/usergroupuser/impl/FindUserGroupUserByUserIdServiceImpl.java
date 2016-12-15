package com.allen.service.user.usergroupuser.impl;

import com.allen.dao.user.usergroupuser.UserGroupUserDAO;
import com.allen.entity.user.UserGroupUser;
import com.allen.service.user.usergroupuser.FindUserGroupUserByUserIdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Allen on 2016/12/15 0015.
 */
@Service
public class FindUserGroupUserByUserIdServiceImpl implements FindUserGroupUserByUserIdService {

    @Resource
    private UserGroupUserDAO userGroupUserDAO;
    @Override
    public List<UserGroupUser> find(long userId) throws Exception {
        return userGroupUserDAO.findByUserId(userId);
    }
}
