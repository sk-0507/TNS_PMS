package com.suraj.placement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement")
public class placementDetail {
	@Id
	int id;
	String name;
	String college;
	String qualification;
	int year;
	int date;
	public placementDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public placementDetail(int id, String name, String college, String qualification, int year, int date) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.qualification = qualification;
		this.year = year;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	
}




//public class placementDetail {
//
//}





