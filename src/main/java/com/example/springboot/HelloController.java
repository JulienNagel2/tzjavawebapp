package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String monstring = "exemple111";
		System.out.println("JNG msg for v2.7 : " + monstring);
		return "Greetings from Spring Boot + Tanzu + JNG v2.7 : " + monstring;
	}

}