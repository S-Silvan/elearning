package com.elearning.web.model;

import java.net.URL;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CourseDetails")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Course ID",nullable=false)
	private Integer course_id;
	
	@Column(name="Courseimage URL",nullable=false)
	private String course_url;
	
	@Column(name="Course Category",nullable=false)
	private String course_category;
	
	@Column(name="Course Heading",nullable=false)
	private String course_heading;
	
	

	@Column(name="Course Content",nullable=false)
	private String course_content;

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public String getCourse_url() {
		return course_url;
	}

	public void setCourse_url(String course_url) {
		this.course_url = course_url;
	}

	public String getCourse_category() {
		return course_category;
	}

	public void setCourse_category(String course_category) {
		this.course_category = course_category;
	}
	
	public String getCourse_heading() {
		return course_heading;
	}

	public void setCourse_heading(String course_heading) {
		this.course_heading = course_heading;
	}

	public String getCourse_content() {
		return course_content;
	}

	public void setCourse_content(String course_content) {
		this.course_content = course_content;
	}


	

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_url=" + course_url + ", course_category=" + course_category
				+ ", course_heading=" + course_heading + ", course_content=" + course_content + "]";
	}
	
	
}
