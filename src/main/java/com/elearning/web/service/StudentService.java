package com.elearning.web.service;


import java.util.List;

import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;


public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Course> getCourses();
	public Student enrollCourse(Integer id,Student student);
	public Student login(String userId, String password);

	
	
	
	
	
	
	public Assignment addAssignment(Assignment assignment);
	public Assignment getOneAssignment(Integer assignment_id);
	public Assignment updateAssignment(Assignment assignment);
	public Assignment deleteAssignment(Integer assignment_id);


}
