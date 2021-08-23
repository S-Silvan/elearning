package com.elearning.web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;
import com.elearning.web.service.TeacherService;

@RestController
public class TeacherController {
	private TeacherService teacherservice;
	
	@PostMapping("/add-course")
	@ResponseBody
	public Course createCourse(@RequestBody Course course) {
		teacherservice.createCourse(course);
		return course;
	}
	
	@GetMapping("/get-course/{course_id}")
	@ResponseBody
	public Course getOneCourse (@PathVariable("course_id")Integer course_id) {
		Course course = teacherservice.getoneCourse(course_id);
		return course;
	}
	
	@PutMapping(path="/update-course")
	public Course updateCourse(@RequestBody Course course) {
		teacherservice.updateCourse(course);
		return course;
	}
	
	@DeleteMapping("/delete-course/{course_id}")
	public Course deleteCourse(@PathVariable("course_id")Integer course_id) {
		return teacherservice.deleteCourse(course_id);
	}
}
