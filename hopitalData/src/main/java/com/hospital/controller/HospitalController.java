package com.hospital.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Hospital;
import com.hospital.service.HospitalService;

@RestController
@RequestMapping("/detail")
public class HospitalController {

	@Autowired
	HospitalService hospitalservice;
	
	@PostMapping("/see")
	public String addPatientDetails(@RequestBody Hospital hospital) {
		return hospitalservice.addPatientDetails(hospital);
	}
	
	@GetMapping("/get")
	List<Hospital>getDetails(){
		return hospitalservice.getDetails();
	}
	
	@PutMapping("/update")
	public String UpdatedDetails(@RequestBody Hospital hospital) {
		return hospitalservice.UpdatedDetails(hospital);
	}
	
	@GetMapping("/getone/{id}")
	public Optional<Hospital>getOneDetails(@PathVariable int id){
		return hospitalservice.getOneDetails(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDetails(@PathVariable int id) {
		hospitalservice.deleteDetails(id);
	}
	
	
	
	
	
}