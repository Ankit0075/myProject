package com.example.Institute.codersInstitute.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Institute.codersInstitute.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
