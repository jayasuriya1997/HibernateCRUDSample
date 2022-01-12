package com.student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;

	public String addStudentDetails(Student student) {
		studentRepository.save(student);
		return "Success";
	}

}
