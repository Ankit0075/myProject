package com.example.Institute.codersInstitute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fees {
	
	@Id
	Long transactionId;
	Double totalFees;
	Double totalPaidFees;
	int instalment;
	int instalmentNumber;
	Double remainingFees;
	String paymentMode;
	Long studentId;
	
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}
	public Double getTotalPaidFees() {
		return totalPaidFees;
	}
	public void setTotalPaidFees(Double totalPaidFees) {
		this.totalPaidFees = totalPaidFees;
	}
	public int getInstalment() {
		return instalment;
	}
	public void setInstalment(int instalment) {
		this.instalment = instalment;
	}
	public int getInstalmentNumber() {
		return instalmentNumber;
	}
	public void setInstalmentNumber(int instalmentNumber) {
		this.instalmentNumber = instalmentNumber;
	}
	public Double getRemainingFees() {
		return remainingFees;
	}
	public void setRemainingFees(Double remainingFees) {
		this.remainingFees = remainingFees;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

}
