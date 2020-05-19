package com.sumit.parent.service.invoker.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumit.parent.service.invoker.config.ServiceInvokerConstants;
import com.sumit.parent.service.invoker.functional.CallService;

import io.swagger.models.Response;

@RestController
@RequestMapping("/invoker")
public class SerivceInvokerController {
	// private Logger logger;

	

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/all")
	public ResponseEntity<?> invokeAllServices() {
		StringBuilder builder= new StringBuilder("Starting Invoking Services \n");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> response = restTemplate.exchange(ServiceInvokerConstants.DATA_ACCESS_URI, HttpMethod.GET, entity, String.class);
		System.out.println("Response from Data Access Service " + response.getBody());
		builder.append(response.getBody());
		
		response = restTemplate.exchange(ServiceInvokerConstants.BILLING_SERVICE_URI, HttpMethod.GET, entity, String.class);
		System.out.println("Response from Data Access Service " + response.getBody());
		builder.append(response.getBody());
		
		response = restTemplate.exchange(ServiceInvokerConstants.AUDIT_SERVICE_URI, HttpMethod.GET, entity, String.class);
		System.out.println("Response from Data Access Service " + response.getBody());
		builder.append(response.getBody());
		
		return new ResponseEntity<>(builder.toString()+"\n All Services are Invoked", HttpStatus.OK);
	}
	
	@GetMapping("/functional/all")
	public ResponseEntity<?> invokeAllServices_usingFunctional() {
		StringBuilder builder= new StringBuilder("Starting Invoking Services Functional Way  \n");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
				
		ResponseEntity<?> response = callService.callService(ServiceInvokerConstants.DATA_ACCESS_URI,entity);
		
		System.out.println("Response from Data Access Service " + response.getBody());
		builder.append(response.getBody());
		
		response = callService.callService(ServiceInvokerConstants.BILLING_SERVICE_URI,entity);
		System.out.println("Response from Billing Service " + response.getBody());
		builder.append(response.getBody());
		
		response = callService.callService(ServiceInvokerConstants.AUDIT_SERVICE_URI,entity);
		System.out.println("Response from Audti Service " + response.getBody());
		builder.append(response.getBody());
		
		return new ResponseEntity<>(builder.toString()+"\n All Services are Invoked", HttpStatus.OK);
	}
	
	
	CallService<ResponseEntity<String>> callService = new CallService<ResponseEntity<String>>() {
		
		@Override
		public ResponseEntity<?> callService(String url,HttpEntity<?> entity) {
			return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		}
	};
	
	
}
