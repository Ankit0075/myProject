package com.example.Institute.codersInstitute.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Institute.codersInstitute.Entity.Batch;
import com.example.Institute.codersInstitute.Entity.Fees;
import com.example.Institute.codersInstitute.Entity.Student;
import com.example.Institute.codersInstitute.Service.BatchService;
import com.example.Institute.codersInstitute.Service.FeesService;
import com.example.Institute.codersInstitute.Service.StudentService;

@RestController
@RequestMapping("/custom")
public class StudentCustomDto {


	    @Autowired
	    private StudentService studentService;

	    @Autowired
	    private FeesService feesService;

	    @Autowired
	    private BatchService batchService;

	    @GetMapping("/studentData")
	    public List<StudentDTO> getStudentData() {
	        List<StudentDTO> studentDataList = new ArrayList<>();

	        // Fetch all students from the service
	        List<Student> students = studentService.getAll();

	        for (Student student : students) {
	        	StudentDTO studentData = new StudentDTO();

	            // Set basic student information
	            studentData.setStudentId(student.getId());
	            studentData.setStudentFirstName(student.getFirstName());
	            studentData.setLastName(student.getLastName());
	            studentData.setStudentContact(student.getStudentContact());

	            // Fetch fees information for the student from the service
	            Optional<Fees> feesOptional = feesService.fetchFeesById(student.getId());
	            Fees fees = feesOptional.orElse(null);

	            if (fees != null) {
	                studentData.setTotalPaidFees(fees.getTotalPaidFees());
	                studentData.setRemainingFees(fees.getRemainingFees());
	            }

	            // Fetch batch information for the student from the service
	            Optional<Batch> batchOptional = batchService.findBatchBy(student.getId());
	            Batch batch = batchOptional.orElse(null);

	            if (batch != null) {
	                studentData.setBatchName(batch.getBatchName());
	            }

	            studentDataList.add(studentData);
	        }

	        return studentDataList;
	    }
	}


