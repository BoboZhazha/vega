package com.zhang.dianping.service.impl;

import com.zhang.dianping.dal.UserModelMapper;
import com.zhang.dianping.model.UserModel;
import com.zhang.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;


    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
