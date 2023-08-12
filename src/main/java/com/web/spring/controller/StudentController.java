package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Student;
import com.web.spring.service.StudentService;

@RestController
@RequestMapping(value = "/studentapi")
public class StudentController {

	@Autowired
	StudentService service;
	
	//studentapi/getstudents
	@GetMapping(value = "/getstudents", produces = {"application/json", "application/xml"})
	public List<Student> getStudents(){
		
		return service.getStudents();
	}
	
	//studentapi/savestudents
	@PostMapping(value = "/savestudents", consumes = {"application/json"})
	public String saveStudents(@RequestBody Student student) {
		
		service.saveStudents(student);
		return "Student saved with RollNo: "+student.getRollno();
		
	}
}
