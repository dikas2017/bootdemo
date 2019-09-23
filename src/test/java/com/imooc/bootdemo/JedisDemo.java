package com.imooc.bootdemo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisDemo {

    @Test
    public void jedisTest() {
        //设置IP地址和端口
        Jedis jedis = new Jedis("192.168.56.5", 6379);
        //密码验证
        jedis.auth("2333");
        //保存数据
        jedis.set("name", "MayJay");
        //获取数据
        System.out.println(jedis.get("name"));
        //释放资源
        jedis.close();
    }
}
