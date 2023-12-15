package com.example.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
//		System.out.println("Welcome");
		
		SpringApplication.run(LoginApplication.class, args);
	}

}

