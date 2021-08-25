package com.elearning.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.web.dao.CourseDao;
import com.elearning.web.model.Course;


@Service
public class TeacherServiceImplementation implements TeacherService {
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public Course createCourse(Course course) {
		return courseDao.save(course);
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	
	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}
	
	@Override
	public boolean deleteCourse(Integer course_id){
		courseDao.deleteById(course_id);
		return true;
	}

}
