package com.elearning.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.StudentDao;
import com.elearning.web.model.Student;

@Component
public class StudentRegistrationImplementation implements StudentRegistration {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}

}
