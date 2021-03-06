package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Service.StudentService;
import com.student.entity.Student;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	StudentService studentservice;

	@PostMapping("/add")
	public String addStudentDetails(@RequestBody Student student) {

		return studentservice.addStudentDetails(student);
	}
}

