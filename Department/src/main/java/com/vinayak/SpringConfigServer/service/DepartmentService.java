package com.vinayak.SpringConfigServer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.SpringConfigServer.entity.Department;
import com.vinayak.SpringConfigServer.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Inside Post method of DepartmentService !");
		return departmentRepository.save(department);
	}
	
	public  Department findDepartmentId(Integer  departmentID) {
		log.info("Inside Post method of DepartmentService !");
		return departmentRepository.findByDepartmentId(departmentID);
	}
	
}
