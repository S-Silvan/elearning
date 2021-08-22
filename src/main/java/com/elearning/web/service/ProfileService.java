package com.elearning.web.service;

import com.elearning.web.model.Student;

public interface ProfileService {
	Student addStudent(Student student);
	Student getOneStudent(Integer id);
	Student updateStudent(Student student);
	Student deleteStudent(Integer id);
}
