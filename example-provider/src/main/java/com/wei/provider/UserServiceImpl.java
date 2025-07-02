package com.wei.provider;

import com.wei.common.model.User;
import com.wei.common.service.UserService;

/**
 * @author LzWei
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
