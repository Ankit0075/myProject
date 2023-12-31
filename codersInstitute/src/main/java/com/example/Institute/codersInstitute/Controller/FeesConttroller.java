package com.example.Institute.codersInstitute.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Institute.codersInstitute.Entity.Fees;
import com.example.Institute.codersInstitute.Service.FeesService;

@RestController
@RequestMapping("/fees")
public class FeesConttroller {
	
	@Autowired
	FeesService feesService;
	
	@PostMapping("/save")
	public Fees createFeesId (@RequestBody Fees fees) {
		return feesService.createFeesId(fees);
	}
	
	@GetMapping("/fees")
	public Optional<Fees> fetchFeesById (@RequestParam Long id) {
		return feesService.fetchFeesById(id);
	}
	@DeleteMapping("/fees")
	public String deleteFeesId(@RequestParam Long id) {
		return feesService.deleteFeesId(id);
	}

}
