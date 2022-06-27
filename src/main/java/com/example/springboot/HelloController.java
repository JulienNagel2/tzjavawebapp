package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String monmot = "what a wonderful world of containers";
		System.out.println("JNG msg for v2.8 : " + monmot);
		return "Greetings from Spring Boot + Tanzu + JNG v2.8 : " + monmot;
	}

}