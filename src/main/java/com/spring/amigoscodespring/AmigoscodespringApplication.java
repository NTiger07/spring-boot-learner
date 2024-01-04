package com.spring.amigoscodespring;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.spring.amigoscodespring.student.Student;

import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class AmigoscodespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodespringApplication.class, args);
		System.out.println("Server Started ");
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student (
				1L, 
				"Favour", 
				"favourtesting@gmail.com", 
				LocalDate.of(2005, Month.SEPTEMBER, 24), 
				21
				)
			);
	}

}
