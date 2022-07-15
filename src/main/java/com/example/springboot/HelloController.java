package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String toReturnOriginal = "Greetings from Spring Boot + Tanzu!"; // use that to pass maven test!
		String monmot = "what a wonderful world of containers indeed!";
		System.out.println("JNG msg for v2.9 : " + monmot);
		String toReturnModifiedByJNG = "Greetings from Spring Boot + Tanzu + JNG v2.9 : " + monmot;
		return toReturnOriginal;
	}

}