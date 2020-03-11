package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Lenovo
 */
@Configuration
@Profile(value = "dev")//指定多环境配置类的标识

public class DevDBConnector implements DBConnector {
    @Override
    public void configure(){
        System.out.println("数据库配置环境--dev");
    }
}
