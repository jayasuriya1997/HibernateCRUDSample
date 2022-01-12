package com.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class HospitalDao {
	@Autowired
	HospitalRepository hospitalrepository;

	public String addPatientDetails(Hospital hospital) {
		hospitalrepository.save(hospital);
		return "sucessfully added";
	}

}
