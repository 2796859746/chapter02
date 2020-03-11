package com.example.domin;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Configuration//指定当前类为配置类
@Component
@PropertySource("classpath:test.properties")//指定自定义配置文件的位置和名称
//@EnableConfigurationProperties(MyProperties.class)//开启配置类的属性注入功能
@ConfigurationProperties(prefix = "test")
public class MyProperties {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
