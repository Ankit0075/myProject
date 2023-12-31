package com.example.Institute.codersInstitute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
 
	@Id
	Long batchId;
	String batchName;
	String startDate;
	String endDate;
	String batchCategory;
	Long studentId;
	
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBatchCategory() {
		return batchCategory;
	}
	public void setBatchCategory(String batchCategory) {
		this.batchCategory = batchCategory;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
		
}
