package com.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao studentdao;

	public String addStudentDetails(Student student) {
		return studentdao.addStudentDetails(student);
	}

}
