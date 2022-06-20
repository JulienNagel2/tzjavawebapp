package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("JNG msg1");
		return "Greetings from Spring Boot + Tanzu + JNG v2.5!";
	}

}