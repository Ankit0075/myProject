package com.example.Institute.codersInstitute.DTO;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO {

	Long studentId;
	String studentFirstName;
	String lastName;
	Long studentContact;
	Double totalPaidFees;
	Double remainingFees;
	String batchName;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(Long studentContact) {
		this.studentContact = studentContact;
	}
	public Double getTotalPaidFees() {
		return totalPaidFees;
	}
	public void setTotalPaidFees(Double totalPaidFees) {
		this.totalPaidFees = totalPaidFees;
	}
	public Double getRemainingFees() {
		return remainingFees;
	}
	public void setRemainingFees(Double remainingFees) {
		this.remainingFees = remainingFees;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
}
