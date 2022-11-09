package com.vinayak.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinayak.UserService.entity.Employee;
import com.vinayak.UserService.pojo.UserDepartment;
import com.vinayak.UserService.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public Employee saveUser(@RequestBody Employee user) {
		log.info("Inside SaveUser of UserController");
		return userService.save(user);
	}
	
	@GetMapping("/{userId}")
	public UserDepartment getUserDepartment(@PathVariable Long userId) {
		log.info("Inside getUserDepartment of UserController");
		return userService.getUserDepartment(userId);
	}
	

}
