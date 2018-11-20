package com.dimple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching
@MapperScan("com.dimple.dao")
@EnableSwagger2
public class DimpleBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(DimpleBlogApplication.class, args);
    }
}