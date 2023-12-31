package com.example.Institute.codersInstitute.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Institute.codersInstitute.Entity.Fees;
import com.example.Institute.codersInstitute.Repository.FeesRepository;

@Service
public class FeesService {

	@Autowired
	FeesRepository feesRepository;
	
	public Fees createFeesId(Fees fees) {
		
		Double totalFees = fees.getTotalFees();
		Double totalPaidFees = fees.getTotalPaidFees();
		Double remainingFees = fees.getRemainingFees();
		
		if(totalFees >= 0) {
			remainingFees = calculateRemainingFees(totalFees, totalPaidFees);
			
			fees.setRemainingFees(remainingFees);
			fees.setTotalPaidFees(totalPaidFees);
			}else {
				fees.setRemainingFees(totalFees);
			}
		return feesRepository.save(fees);
	}

	private Double calculateRemainingFees(Double totalFees, Double totalPaidFees) {
		Double remainingFees = totalFees - totalPaidFees;
		return remainingFees;
	}

	public Optional<Fees> fetchFeesById(Long id) {
		return feesRepository.findById(id);
	}

	public String deleteFeesId(Long id) {
        feesRepository.deleteById(id);
		return "Id deleted sucessfully";
	}

	
	
}
