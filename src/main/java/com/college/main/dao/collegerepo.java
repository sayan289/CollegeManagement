package com.college.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.college.main.entities.college;
@Repository
public interface collegerepo extends CrudRepository<college, Integer>{

}

