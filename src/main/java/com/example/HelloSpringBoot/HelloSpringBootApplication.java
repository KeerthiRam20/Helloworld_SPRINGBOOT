package com.example.HelloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringBootApplication.class, args);
		System.out.println("\n Demonstration of simple hello world program using restful service \n ");
	}

}
