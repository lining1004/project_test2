package com.briup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//启动类 
@SpringBootApplication
public class SpringBootDemoApplication {
	/*
	 * 编写的代码中注解：
	 * 扫描的位置 com.briup包 
	 * 及其子包：
	 * com.briup.web包
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
