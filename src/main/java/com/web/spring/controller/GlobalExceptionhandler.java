package com.web.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.web.spring.exception.ErrorResponse;
import com.web.spring.exception.StudentNotFoundException;

@ControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> handlestudentnotfoundexception(StudentNotFoundException snf) {
		
		ErrorResponse errorresponse=new ErrorResponse();
		errorresponse.setErrorcode(HttpStatus.NOT_FOUND.value());
		errorresponse.setErrormessage(snf.getMsg());
		
		return new ResponseEntity<>(errorresponse, HttpStatus.OK);
	}
}
