package com.web.spring.exception;

public class StudentNotFoundException extends RuntimeException{

	String msg;

	public String getMsg() {
		return msg;
	}

	public StudentNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
