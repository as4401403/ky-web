package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description: 启动程序
 * @author: jinhaibin
 * @create: 2019/09/22 20:52
 **/
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class KyApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(KyApplication.class, args);
        System.out.println("============ 系统启动成功 ！！！================ \n");
    }
}