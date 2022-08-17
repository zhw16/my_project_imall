package com.zhang.imall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//指定扫描mapper接口位置，Spring就能知道我们的Mapper接口在哪儿了，也就能去创建Mapper接口对应的对象了
@MapperScan(basePackages = "com.zhang.imall.model.dao")
public class ImallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallApplication.class, args);
    }

}
