package com.gm.springmvcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //启动类
@MapperScan("com.gm.springmvcdemo.dao")    // mapper 接口类扫描包配置
public class SpringmvcdemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcdemoApplication.class, args);
	}

}
