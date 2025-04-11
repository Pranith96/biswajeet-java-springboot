package com.employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(EmployeeDataException.class)
	public ResponseEntity<ExceptionResponse> handleEmployeeDataException(EmployeeDataException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus("500");
		response.setError("Internal Server Error");
		response.setTimestamp(LocalDateTime.now());
		response.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
