package com.spring.amigoscodespring;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AmigoscodespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodespringApplication.class, args);
		System.out.println("Server Started on port 8080");
	}


}
