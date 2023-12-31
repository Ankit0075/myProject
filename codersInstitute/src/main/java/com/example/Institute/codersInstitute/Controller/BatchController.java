package com.example.Institute.codersInstitute.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Institute.codersInstitute.Entity.Batch;
import com.example.Institute.codersInstitute.Service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController {
	
	@Autowired	
	BatchService batchService;
	
	@PostMapping("/save")
	public Batch createBatch (@RequestBody Batch batch) {
		return batchService.createBatch(batch);
		}
	
	@GetMapping("/fetchAll")
	public List<Batch> fetchAllBatch(){
		return batchService.fetchAllBatch();	
	}
	
	@GetMapping("/fees")
	public Optional<Batch> findBatchBy(@RequestParam Long batchId) {
		return batchService.findBatchBy(batchId);		
	}
	

}
