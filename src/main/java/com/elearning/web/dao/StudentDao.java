package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

}
