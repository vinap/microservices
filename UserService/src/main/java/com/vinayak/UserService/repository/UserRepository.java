package com.vinayak.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinayak.UserService.entity.Employee;

@Repository
public interface UserRepository extends JpaRepository<Employee, Long>{

	

}
