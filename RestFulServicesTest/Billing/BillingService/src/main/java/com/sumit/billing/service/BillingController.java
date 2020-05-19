package com.sumit.billing.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
	
	@GetMapping
	public ResponseEntity<?> getAllRecords() {
		
		
		return new ResponseEntity<>("Calling Billing Service " , HttpStatus.OK);
	}

}
