package com.ITAcademy.Ex10Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex10SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex10SpringApplication.class, args);
	}
	
	@CrossOrigin
	@GetMapping("/")
	public String hello(
			@RequestParam(value = "nom", defaultValue = "World") 
			String nom) {
		return String.format("Hello %s!", nom);
	}
	
}
