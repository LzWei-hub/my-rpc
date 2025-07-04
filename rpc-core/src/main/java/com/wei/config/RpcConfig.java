package com.wei.config;

import lombok.Data;

/**
 * @author LzWei
 */
@Data
public class RpcConfig {

    /**
     * 名称
     */
    private String name = "my-rpc";


    /**
     * 版本号
     */
    private String version = "1.0";

    /**
     * 服务器主机
     */
    private String serverHost = "localhost";

    /**
     * 服务器端口号
     */
    private Integer serverPort = 8080;
}
