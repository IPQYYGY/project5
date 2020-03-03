package com.accp.project5.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.accp.springboot1.dao" })
public class BeansConfig {
	
}
