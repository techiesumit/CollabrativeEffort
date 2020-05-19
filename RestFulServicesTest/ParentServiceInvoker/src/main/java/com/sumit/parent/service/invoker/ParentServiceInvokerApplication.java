package com.sumit.parent.service.invoker;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class ParentServiceInvokerApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ParentServiceInvokerApplication.class, args);
	}
	
	
	  @Bean 
	  public RestTemplate restTemplate(RestTemplateBuilder builder) {
	  
	  System.out.println("Calling custoom rest Template "); return
	  builder.setConnectTimeout(Duration.ofMillis(3000)).setReadTimeout(Duration.
	  ofMillis(3000)).build(); }
	 

	
}
