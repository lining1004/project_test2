package com.briup.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//localhost:8899/ 默认项目名为空
	@RequestMapping("/")
	public String index() {
		return "hello world !";
	}
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "hello ！";
	}
}
