package com.elearning.web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Student;
import com.elearning.web.service.ProfileService;

@RestController
public class ProfileController {
	private ProfileService profileService;
	
	@PostMapping("/add-student")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		profileService.addStudent(student);
		return student;
	}
	
	@GetMapping("/get-student/{student_id}")
	@ResponseBody
	public Student getStudent(@PathVariable("student_id")Integer studentId) {
		Student student=profileService.getOneStudent(studentId);
		return student;
	}
	
	@PutMapping(path="/update-student")
	public Student updateStudent(@RequestBody Student student) {
		profileService.updateStudent(student);
		return student;
	}
	
	@DeleteMapping("/delete-student/{student_id}")
	public Student deleteStudent(@PathVariable("student_id")Integer studentId) {
		return profileService.deleteStudent(studentId);
	}
}
