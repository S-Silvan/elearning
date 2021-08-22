package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Teacher;

public interface AdminDao  extends JpaRepository<Teacher,Integer> {

}
