package com.elearning.web.service;

import java.util.List;

import com.elearning.web.model.Course;

public interface TeacherService {
	public Course createCourse(Course course);
	public List<Course> getCourses();
	public Course updateCourse(Course course);
	public boolean deleteCourse(Integer course_id);

}
