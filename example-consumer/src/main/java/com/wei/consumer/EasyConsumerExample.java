package com.wei.consumer;

import com.wei.common.model.User;
import com.wei.common.service.UserService;
import com.wei.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 * @author LzWei
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
        // UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("LzWei");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("没有找到该用户");
        }
    }
}
