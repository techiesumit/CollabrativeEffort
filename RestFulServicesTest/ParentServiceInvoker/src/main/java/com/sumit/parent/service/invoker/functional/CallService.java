package com.sumit.parent.service.invoker.functional;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@FunctionalInterface
public interface CallService<T> {
	ResponseEntity<?> callService(String url,HttpEntity<?> entity);
}
