package com.wei.server;

import io.vertx.core.Vertx;

/**
 * Vertx HTTP 服务器
 *
 * @author LzWei
 */
public class VertHttpServer implements HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    public void doStart(int port) {
        // 创建 Vert.x 实例
        Vertx vertx = Vertx.vertx();

        // 创建 HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 监听端口并处理请求
        server.requestHandler(new HttpServerHandler());

        // 启动 HTTP 服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("HTTP 服务已启动，监听端口：" + port);
            } else {
                System.out.println("HTTP 服务启动失败：" + result.cause());
            }
        });
    }
}
