package com.tesys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@GetMapping("/getMsg")
	public String getMessage() {
		System.out.println("SONO IL CONTAINER GOLDBERG");
		return "Docker Test Successful";
	}
}