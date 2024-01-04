package com.spring.amigoscodespring.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
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
 