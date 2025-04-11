package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/employee")
@RestController
public class EmployeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to spring";
	}

	@GetMapping("/display")
	public String getdisplay() {
		return "Welcome to Java";
	}
}
