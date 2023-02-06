package com.example.accessingdatamysql.service.repo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="courses") // This tells Hibernate to make a table out of this class
public class CourseEntity1 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="CourseId", updatable=false)	
	private Integer courseId;

	@Column(name="Name")
	private String name;

	@Column(name="Credit")
	private Integer credit;

	@Column(name="MaxSeat")
	private Integer maxseat;

	





	public CourseEntity1() {
	}
	
	public CourseEntity1(Integer courseId, String name, Integer credit, Integer maxseat) {
		this.courseId = courseId;
		this.name = name;
		this.credit = credit;
		this.maxseat = maxseat;
	}




	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getMaxSeat() {
		return maxseat;
	}

	public void setMaxSeat(Integer maxseat) {
		this.maxseat = maxseat;
	}

	


}