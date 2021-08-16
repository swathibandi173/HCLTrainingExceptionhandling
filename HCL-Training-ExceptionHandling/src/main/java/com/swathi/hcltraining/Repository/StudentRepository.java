package com.swathi.hcltraining.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.hcltraining.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	public List<Student> findByNameEquals(String name);
	public List<Student> findByNameIsNot(String name);
	public List<Student> findByBranchIsNull();
	public List<Student> findByEmailAndAge(String email,Integer age);
	public List<Student> findByAgeLessThan(Integer age);
	public List<Student> findByAgeBetween(Integer startAge, Integer endAge);
	public List<Student> findByNameOrderByName(String name);
	public List<Student> findByBranchOrderByBranchDesc(String branch);

}
