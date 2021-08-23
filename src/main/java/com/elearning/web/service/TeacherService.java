package com.elearning.web.service;

import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;

public interface TeacherService {
	public Course createCourse(Course course);
	public Course getoneCourse(Integer course_id);
	public Course updateCourse(Course course);
	public Course deleteCourse(Integer course_id);

}
