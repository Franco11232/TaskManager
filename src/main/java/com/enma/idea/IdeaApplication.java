package com.enma.idea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class IdeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeaApplication.class, args);
		System.out.println("hello ric test");
	}

	@GetMapping("/")
	public String test() {
		return "index";
	}

}
