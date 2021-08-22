package com.elearning.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.ProfileDao;
import com.elearning.web.model.Student;

@Component
public class ProfileServiceImplementation implements ProfileService {
	@Autowired
	private ProfileDao profileDao;

	@Override
	public Student addStudent(Student student) {
		return profileDao.save(student);
	}

	@Override
	public Student getOneStudent(Integer id) {
		Optional<Student> student=profileDao.findById(id);
		return student.isPresent()?(Student)student.get():null;
	}

	@Override
	public Student updateStudent(Student student) {
		return profileDao.save(student);
	}

	@Override
	public Student deleteStudent(Integer id) {
		Student student=getOneStudent(id);
		profileDao.deleteById(id);
		return student;
	}
}
