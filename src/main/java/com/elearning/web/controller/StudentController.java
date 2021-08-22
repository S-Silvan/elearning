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
import com.elearning.web.service.StudentService;

@RestController
public class StudentController {
	private StudentService studentService;
	
	@PostMapping("/add-assignment")
	@ResponseBody
	public Assignment addAssignment(@RequestBody Assignment assignment) {
		studentService.addAssignment(assignment);
		return assignment;
	}
	
	@GetMapping("/get-assignment/{assignment_id}")
	@ResponseBody
	public Assignment getOneAssignment(@PathVariable("assignment_id")Integer assignment_id) {
		Assignment assignment=studentService.getOneAssignment(assignment_id);
		return assignment;
	}
	
	@PutMapping(path="/update-assignment")
	public Assignment updateAssignment(@RequestBody Assignment assignment) {
		studentService.updateAssignment(assignment);
		return assignment;
	}
	
	@DeleteMapping("/delete-assignment/{assignment_id}")
	public Assignment deleteAssignment(@PathVariable("assignment_id")Integer assignment_id) {
		return studentService.deleteAssignment(assignment_id);
	}
}

