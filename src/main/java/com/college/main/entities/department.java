package com.college.main.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="college_dept")
public class department {
	@Id
	private int departmentid;
	private String departmentname;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = teacher.class)
	@JoinColumn(name="dept_id",referencedColumnName = "departmentid")
	List<teacher> teacher;
	public List<teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<teacher> teacher) {
		this.teacher = teacher;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	

}
