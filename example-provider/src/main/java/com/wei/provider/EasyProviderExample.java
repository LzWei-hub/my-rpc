package com.wei.provider;

import com.wei.common.service.UserService;
import com.wei.registry.LocalRegistry;
import com.wei.server.VertHttpServer;

/**
 * 简易服务提供者示例
 *
 * @author LzWei
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        VertHttpServer httpServer = new VertHttpServer();
        httpServer.doStart(8080);
    }
}
