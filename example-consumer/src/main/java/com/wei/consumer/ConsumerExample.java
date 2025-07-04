package com.wei.consumer;

import com.wei.config.RpcConfig;
import com.wei.utils.ConfigUtils;

/**
 * 简易服务消费者示例
 *
 * @author LzWei
 */
public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
