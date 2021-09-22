package com.spring.AwsSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/helloOne")
	public String hello() {
		return "Hello this is Soumayadip";
	}

}
