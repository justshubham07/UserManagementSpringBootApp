package com.web.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.bean.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
