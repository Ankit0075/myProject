package com.example.Institute.codersInstitute.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Institute.codersInstitute.Entity.Batch;
import com.example.Institute.codersInstitute.Repository.BatchRepository;

@Service
public class BatchService {

	@Autowired
	BatchRepository batchRepository;
	
	
	public Batch createBatch(Batch batch) {
		return batchRepository.save(batch);
	}


	public List<Batch> fetchAllBatch() {
		return batchRepository.findAll();
	}


	public Optional<Batch> findBatchBy(Long batchId) {
		return batchRepository.findById(batchId);
	}

}
