package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Course;

public interface TeacherDao extends JpaRepository<Course,Integer>{

}
