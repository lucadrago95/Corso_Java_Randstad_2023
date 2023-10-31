package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Hello3Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello3Application.class, args);
	}
	@RestController
	public static class HelloWorld{
		@GetMapping("/helloworld")
		public String hello(){
			return "<h1>Hello World!!!</h1>";
		}
	}
}
