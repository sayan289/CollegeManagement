package com.college.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="college_tc")
public class teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherid;
	private String teachername;
	private String teacheraddress;
	private String teacherph;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacheraddress() {
		return teacheraddress;
	}
	public void setTeacheraddress(String teacheraddress) {
		this.teacheraddress = teacheraddress;
	}
	public String getTeacherph() {
		return teacherph;
	}
	public void setTeacherph(String teacherph) {
		this.teacherph = teacherph;
	}
	
}
