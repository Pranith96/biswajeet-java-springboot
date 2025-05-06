package com.cart.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CartExceptionHandler {

	@ExceptionHandler(value = BusinessException.class)
	public ResponseEntity<ExceptionResponse> handleBusinessException(BusinessException ex) {
		ExceptionResponse response = ExceptionResponse.builder().statusCode("404").error("Not Found")
				.message(ex.getMessage()).timeStamp(LocalDateTime.now()).build();
		return ResponseEntity.internalServerError().body(response);
	}
}
