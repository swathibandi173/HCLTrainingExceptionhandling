package com.swathi.hcltraining.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swathi.hcltraining.exception.EmptyInputException;
import com.swathi.hcltraining.exception.NoElementFoundException;
import com.swathi.hcltraining.Entity.Student;
import com.swathi.hcltraining.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> findByNameEquals(String name){
		List<Student> findByNameEquals = studentRepository.findByNameEquals(name);
		
		if(findByNameEquals.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByNameEquals;
	}
	
	public List<Student> findByNameIsNot(String name){
		List<Student> nameIsNot = studentRepository.findByNameIsNot(name);
		if(nameIsNot.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return nameIsNot;
	}
	
	public List<Student> findByBranchIsNull(){
		List<Student> findByBranchIsNull = studentRepository.findByBranchIsNull();
		if(findByBranchIsNull.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByBranchIsNull;
	}
	
		
	public List<Student> findByEmailAndAge(String email,Integer age){
		List<Student> findByEmailAndAge = studentRepository.findByEmailAndAge(email,age);
		if(findByEmailAndAge.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByEmailAndAge;
		
	}
	
	public List<Student> findByAgeLessThan(Integer age){
		List<Student> findByAgeLessThan = studentRepository.findByAgeLessThan(age);
		if(findByAgeLessThan.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
			
		return findByAgeLessThan;
	}
	
	public List<Student> findByAgeBetween(Integer startAge, Integer endAge){
		List<Student> findByAgeBetween = studentRepository.findByAgeBetween(startAge, endAge);
		
		if(findByAgeBetween.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByAgeBetween;
	}
	
	public List<Student> findByNameOrderByName(String name){
		List<Student> findByNameOrderByName = studentRepository.findByNameOrderByName(name);
		
		if(findByNameOrderByName.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByNameOrderByName;
	}
	
	public List<Student> findByBranchOrderByBranchDesc(String branch){
		List<Student> findByBranchOrderByBranchDesc = studentRepository.findByBranchOrderByBranchDesc(branch);
		if(findByBranchOrderByBranchDesc.isEmpty()) {
			throw new NoSuchElementException("Not found data in DB");
		}
		
		return findByBranchOrderByBranchDesc;
	}

	public Student save(Student student) {
		if(student.getName().isEmpty() || student.getName(
				).length()==0) {
			 throw new EmptyInputException("601","Input fields are empty");
		}
		
		 Student addStudent = studentRepository.save(student);
		 return addStudent;
	}

	public List<Student> findAllStudents() {
		
		List<Student> studentList = studentRepository.findAll();
		if(studentList.isEmpty()) {
			throw new NoElementFoundException("602", "Empty list, no element present in DB");
		}
		return studentList;
		
	}

}
