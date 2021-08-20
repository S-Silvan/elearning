package com.elearning.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.ProfileDao;
import com.elearning.web.model.Student;

import com.elearning.web.model.Student;

public class ProfileServiceImplementation implements ProfileService {
	@Autowired
	private ProfileDao profileDao;

	@Override
	public Integer addStudent(Student student) {
		return (Integer)profileDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>)profileDao.findAll();
	}

	@Override
	public Optional<Student> getOneStudent(Integer id) {
		return profileDao.findById(id);
	}

	@Override
	public Integer updateStudent(Student student) {
		return (Integer)profileDao.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		profileDao.deleteById(id);
	}
}
