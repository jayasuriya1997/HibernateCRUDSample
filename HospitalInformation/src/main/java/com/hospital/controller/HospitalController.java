package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/patient")
public class HospitalController {
	@Autowired
	HospitalService hospitalservice;

	@PostMapping("/post")
	public String addPatientDetails(@RequestBody Hospital hospital) {
		return hospitalservice.addPatientDetails(hospital);
	}

}
