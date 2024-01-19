package com.college.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.college.main.dao.collegerepo;
import com.college.main.entities.college;
import com.college.main.entities.department;

@Component
public class collegeserviceImp implements collegeservice{
	@Autowired
	public collegerepo collegerepo;
	@Autowired
	public com.college.main.dao.departmentrepo departmentrepo;
	public college addcollegestudent(college college)
	{
		return collegerepo.save(college);
	}
	public department addteacherviadept(department department)
	{
		return departmentrepo.save(department);
	}
}
