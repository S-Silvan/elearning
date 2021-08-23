package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Course;

public interface CourseDao extends JpaRepository<Course,Integer>{

}
