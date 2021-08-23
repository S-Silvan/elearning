package com.elearning.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.TeacherDao;
import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;


@Component
public class TeacherServiceImplementation implements TeacherService {
	@Autowired
	private TeacherDao teacherdao;
	
	@Override
	public Course createCourse(Course course) {
		return teacherdao.save(course);
	}
	
	@Override
	public Course getoneCourse(Integer course_id) {
		return teacherdao.findById(course_id).get();
	}
	
	@Override
	public Course updateCourse(Course course) {
		return teacherdao.save(course);
	}
	
	@Override
	public Course deleteCourse(Integer course_id){
		Course course=getoneCourse(course_id);
		teacherdao.deleteById(course_id);
		return course;
	}

}
