package com.springbootbackend.springbootbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootbackend.springbootbackend.StudentDetails.StudentDetails;


@Repository
public interface StudentDao extends JpaRepository<StudentDetails, String>{
	
}
