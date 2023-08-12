package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.spring.bean.Student;

@Service
public class StudentService {
	
	private static List<Student> slist=new ArrayList<>();

	static {
		
		slist.add(new Student(11,"Shubham","shubham@gmail.com")) ;
		slist.add(new Student(12,"Marquees","marquees@gmail.com")); 
		slist.add(new Student(13,"Michel","michel@gmail.com")); 
		
	}
	
	public List<Student> getStudents(){
		
		return slist;
	}
	
	public void saveStudents(Student student) {
		
		slist.add(student);
	}
	
}
