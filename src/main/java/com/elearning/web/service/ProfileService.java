package com.elearning.web.service;

import java.util.List;
import java.util.Optional;

import com.elearning.web.model.Student;

public interface ProfileService {
	Integer addStudent(Student student);
	List<Student> getAllStudents();
	Optional<Student> getOneStudent(Integer id);
	Integer updateStudent(Student student);
	void deleteStudent(Integer id);
}
