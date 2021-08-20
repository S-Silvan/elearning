package com.elearning.web.service;

import java.util.List;

import com.elearning.web.model.Student;

public interface ProfileService {
	int addStudent(Student student);
	List<Student> getAllStudents();
	Student getOneStudent();
	boolean updateStudent(Student student);
	boolean deleteStudent(int id);
}
