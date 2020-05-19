package com.sumit.parent.service.invoker.config;

import java.time.Duration;

import org.slf4j.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ApplicationConfiguration {
	/*
	 * private Logger logger;
	 * 
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) {
	 * 
	 * logger.info("Calling custom rest Template "); return
	 * builder.setConnectTimeout(Duration.ofMillis(3000)).setReadTimeout(Duration.
	 * ofMillis(3000)).build(); }
	 */

}
