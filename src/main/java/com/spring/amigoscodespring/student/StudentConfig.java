package com.spring.amigoscodespring.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @SuppressWarnings("null")
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student favour = new Student (
				"Favour", 
				"favourtesting@gmail.com", 
				LocalDate.of(2005, Month.SEPTEMBER, 24)
				);

            Student alex = new Student (
				"Alex", 
				"alextesting@gmail.com", 
				LocalDate.of(2004, Month.APRIL, 26)
				);

            repository.saveAll(List.of(favour, alex));
			
        };
    }
}
