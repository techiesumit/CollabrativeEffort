package com.sumit.audit.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class AuditController {
	
	@GetMapping
	public ResponseEntity<?> getAllRecords() {
		
		
		return new ResponseEntity<>("Calling Audit Service  " , HttpStatus.OK);
	}

}
