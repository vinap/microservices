package com.vinayak.UserService.pojo;

import com.vinayak.UserService.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
 
	Integer departmentId;
	String departmentName;
}
