package com.elearning.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.StudentDao;
import com.elearning.web.model.Assignment;

@Component
public class StudentServiceImplementation implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public Assignment addAssignment(Assignment assignment) {
		return studentDao.save(assignment);
	}

	@Override
	public Assignment getOneAssignment(Integer assignment_id) {
		Optional<Assignment> assignment=studentDao.findById(assignment_id);
		return assignment.isPresent()?(Assignment)assignment.get():null;
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		return studentDao.save(assignment);
	}

	@Override
	public Assignment deleteAssignment(Integer assignment_id){
		Assignment assignment=getOneAssignment(assignment_id);
		studentDao.deleteById(assignment_id);
		return assignment;
	}
}
