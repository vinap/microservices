package com.vinayak.UserService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vinayak.UserService.entity.Employee;
import com.vinayak.UserService.pojo.Department;
import com.vinayak.UserService.pojo.UserDepartment;
import com.vinayak.UserService.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	@Autowired
	RestTemplate restTemplate;

	public Employee save(Employee user) {
		return repository.save(user);
	}

	public UserDepartment getUserDepartment(Long userId) {
		Optional<Employee> user = repository.findById(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.get().getDepartmentId(),
				Department.class);
		UserDepartment userDepartment = new UserDepartment();
		userDepartment.setUser(user.get());
		userDepartment.setDepartment(department);
		return userDepartment;
	}

}
