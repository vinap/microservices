package com.vinayak.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userFallBackMethod() {
		return "User servce getting longer time than expected";
	}
	
	@GetMapping("/departmantServiceFallBack")
	public String departmentFallBackMethod() {
		return "Department servce getting longer time than expected";
	}
}
