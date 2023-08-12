package com.web.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.Student;
import com.web.spring.exception.StudentNotFoundException;
import com.web.spring.repository.StudentRepository;

@RestController
@RequestMapping("/studentapi")
public class StudentCrudController {

	@Autowired
	private StudentRepository repo;
	
	//studentapi/getstudent
	@GetMapping(value = "/getstudent", produces = {"application/json"})
	public List<Student> getallStudent(){
		return (List<Student>) repo.findAll();
		
	}
	
	//studentapi/savestudent
	@PostMapping(value = "/savestudent", produces = {"application/json"}, consumes = {"application/json"})
	public Student saveStudent(@RequestBody Student student) {
		Student savedStudent=repo.save(student);
		return savedStudent;
	}
	
	
		
	    //studentapi/savestudent/
		@GetMapping(value = "/getstudent/{rollno}", produces = {"application/json"})
		public Student getStudent(@PathVariable int rollno){
		
		Optional<Student> ostu=repo.findById(rollno);
		
		Student s =null;
		if(ostu.isPresent()) {
			s=ostu.get();
			
		}else {
			
			throw new StudentNotFoundException("Student not found with rollno: "+rollno);
		}
		
		return s;
		
	    }
	}

