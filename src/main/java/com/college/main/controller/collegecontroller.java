package com.college.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.main.entities.college;
import com.college.main.entities.department;
import com.college.main.service.collegeservice;

@RestController
@RequestMapping("/college")
public class collegecontroller {
	@Autowired
	collegeservice collegeservice;
	@PostMapping("/addcollege")
	public college addcollegestudent(@RequestBody college college)
	{
		return collegeservice.addcollegestudent(college);
	}
	@PostMapping("/adddept")
	public department adddteacherviadepartment(@RequestBody department department)
	{
	return	collegeservice.addteacherviadept(department);
	}
}
