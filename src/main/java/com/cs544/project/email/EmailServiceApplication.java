package com.cs544.project.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class EmailServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}
}
