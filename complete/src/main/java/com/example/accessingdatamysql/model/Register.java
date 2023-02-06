package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Register{
	private Integer studentid;
	private Integer courseid1;
	private Integer courseid2;
	private Integer courseid3;
	private Integer courseid4;
	private Integer courseid5;

	public Integer getStudentId() {
		return studentid;
	}

	public void setStudentId(Integer studentid) {
		this.studentid = studentid;
	}

	public Integer getCourseid1() {
		return courseid1;
	}

	public void setCourseid1(Integer courseid1) {
		this.courseid1 = courseid1;
	}

	public Integer getCourseid2() {
		return courseid2;
	}

	public void setCourseid2(Integer courseid2) {
		this.courseid2 = courseid2;
	}

	public Integer getCourseid3() {
		return courseid3;
	}

	public void setCourseid3(Integer courseid3) {
		this.courseid3 = courseid3;
	}

	public Integer getCourseid4() {
		return courseid4;
	}

	public void setCourseid4(Integer courseid4) {
		this.courseid4 = courseid4;
	}

	public Integer getCourseid5() {
		return courseid5;
	}

	public void setCourseid5(Integer courseid5) {
		this.courseid5 = courseid5;
	}

}