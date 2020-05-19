package com.sumit.dataaccess.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataAccessController {
	
	@GetMapping
	public ResponseEntity<?> getAllRecords() {
		
		
		return new ResponseEntity<>("Calling Data Access " , HttpStatus.OK);
	}

}
