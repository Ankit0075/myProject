package com.example.Institute.codersInstitute.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Institute.codersInstitute.Entity.Student;
import com.example.Institute.codersInstitute.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@GetMapping("/byId")
	public Optional<Student> getStudentById(@RequestParam Long id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentById (@PathVariable Long id) {
		return studentService.deleteStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent (@RequestBody Student CorrectStudent, @PathVariable Long id) {
		return studentService.updateStudent(CorrectStudent, id);
	}
	
}
