package com.example.accessingdatamysql.service.repo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Register") // This tells Hibernate to make a table out of this class
public class RegisterEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="studentid", updatable=false)	
	private Integer studentId;

	@Column(name="courseid1")
	private Integer courseId1;

	@Column(name="courseid2")
	private Integer courseId2;

	@Column(name="courseid3")
	private Integer courseId3;

    @Column(name="courseid4")
	private Integer courseId4;

	@Column(name="courseid5")
	private Integer courseId5;

	





	public RegisterEntity() {
	}
	
	public RegisterEntity(Integer studentId, Integer courseId1, Integer courseId2, Integer courseId3, Integer courseId4, Integer courseId5) {
		this.studentId = studentId;
		this.courseId1 = courseId1;
		this.courseId2 = courseId2;
        this.courseId3 = courseId3;
        this.courseId4 = courseId4;
        this.courseId5 = courseId5;
	}




	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getCourseId1() {
		return courseId1;
	}

	public void setCourseId1(Integer courseId1) {
		this.courseId1 = courseId1;
	}

	public Integer getCourseId2() {
		return courseId2;
	}

	public void setCourseId2(Integer courseId2) {
		this.courseId2 = courseId2;
	}

	public Integer getCourseId3() {
		return courseId3;
	}

	public void setCourseId3(Integer courseId3) {
		this.courseId3 = courseId3;
	}

	public Integer getCourseId4() {
		return courseId4;
	}

	public void setCourseId4(Integer courseId4) {
		this.courseId4 = courseId4;
	}

    public Integer getCourseId5() {
		return courseId5;
	}

	public void setCourseId5(Integer courseId5) {
		this.courseId5 = courseId5;
	}


}