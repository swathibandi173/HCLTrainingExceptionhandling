package com.swathi.hcltraining.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.hcltraining.Entity.Student;
import com.swathi.hcltraining.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student){
		
		return studentService.save(student);
		
	}
	
	@GetMapping("/allstudents")
	public List<Student> findAllStudents(){
		return studentService.findAllStudents();
	}	
	
	@GetMapping("/name/{name}")
	public List<Student> findByNameEquals(@PathVariable String name){
		
		return studentService.findByNameEquals(name);
	}
	
	@GetMapping("/nameisnot/{name}")
	public List<Student> findByNameIsNot(@PathVariable String name){
		return studentService.findByNameIsNot(name);
	}
	
	@GetMapping("/branch")
	public List<Student> findByBranchIsNull(){
		return studentService.findByBranchIsNull();
	}
	
		
	@GetMapping("/email/{email}/age/{age}")
	public List<Student> findByEmailAndAge(@PathVariable @Valid String email,@PathVariable @Valid Integer age){
		return studentService.findByEmailAndAge(email,age);
		
	}
	
	@GetMapping("/age/{age}")
	public List<Student> findByAgeLessThan(@PathVariable @Valid Integer age){
		return studentService.findByAgeLessThan(age);
		
	}
	
	@GetMapping("/stage/{startAge}/endage/{endAge}")
	public List<Student> findByAgeBetween(@PathVariable @Valid Integer startAge, @PathVariable @Valid Integer endAge){
		return studentService.findByAgeBetween(startAge, endAge);
	}
	
	@GetMapping("/orderbyname/{name}")
	public List<Student> findByNameOrderByName(@PathVariable String name){
		return studentService.findByNameOrderByName(name);
	}
	
	@GetMapping("/orderbybranch/{branch}")
	public List<Student> findByBranchOrderByBranchDesc(@PathVariable String branch){
		return studentService.findByBranchOrderByBranchDesc(branch);
	}


}
