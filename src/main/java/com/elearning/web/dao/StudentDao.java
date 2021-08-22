package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Assignment;


public interface StudentDao extends JpaRepository<Assignment,Integer>{

}
