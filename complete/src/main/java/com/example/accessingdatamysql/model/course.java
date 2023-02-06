package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class course{
    private Integer Courseid;
	private String Name;
	private Integer Credit;
    private Integer MaxSeat;
	
	public Integer getCourseid() {
		return Courseid;
	}

	public void setCourseid(Integer Courseid) {
		this.Courseid = Courseid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setMaxSeat(Integer MaxSeat) {
		this.Credit = Credit;
	}

    public Integer getMaxSeat() {
		return MaxSeat;
	}

	public void setCredit(Integer Credit) {
		this.Credit = Credit;
	}

    public Integer getCredit() {
		return Credit;
	}

}
