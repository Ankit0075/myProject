package com.example.Institute.codersInstitute.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Institute.codersInstitute.Entity.Student;
import com.example.Institute.codersInstitute.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	public String deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		return "Data delete sucessfully";
	}

	public Student updateStudent(Student correctStudent, Long id) {

Student student = studentRepository.findById(id).get();
        
        if(student != null) {
        	student.setParentContact(correctStudent.getParentContact());
        }
		if(student != null) {
			student.setId(correctStudent.getId());
		}
		if(student != null) {
			student.setEmail(correctStudent.getEmail());
		}
		if(student != null) {
			student.setStudentContact(correctStudent.getStudentContact());
		}
		if(student != null) {
			student.setFirstName(correctStudent.getFirstName());
		}		
		if(student != null) {
			student.setLastName(correctStudent.getLastName());
		}
		return studentRepository.save(student);
	}
	
	}



