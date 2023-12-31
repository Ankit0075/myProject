package com.example.Institute.codersInstitute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="codersStudent")
public class Student {
	
	@Id
	@GeneratedValue
	Long id;
	String firstName;
	String lastName;
	String currentAddress;
	String email;
	String permanentAddress; 
	Long parentContact ;
	Long studentContact ;
	String education;
	String collageName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Long getParentContact() {
		return parentContact;
	}
	public void setParentContact(Long parentContact) {
		this.parentContact = parentContact;
	}
	public Long getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(Long studentContact) {
		this.studentContact = studentContact;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	
	 
}
