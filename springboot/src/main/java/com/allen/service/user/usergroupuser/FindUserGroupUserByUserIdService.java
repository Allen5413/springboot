package com.allen.service.user.usergroupuser;

import com.allen.entity.user.UserGroupUser;

import java.util.List;

/**
 * Created by Allen on 2016/12/15 0015.
 */
public interface FindUserGroupUserByUserIdService {
    public List<UserGroupUser> find(long userId)throws Exception;
}
