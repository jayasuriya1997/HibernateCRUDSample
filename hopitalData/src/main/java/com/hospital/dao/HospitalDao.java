package com.hospital.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hospital.entity.Hospital;
import com.hospital.repository.HospitalRepository;

@Repository
public class HospitalDao {

	@Autowired
	HospitalRepository hospitalrepository;
	public String addPatientDetails(Hospital hospital) {
		hospitalrepository.save(hospital);
		return "sucess";
	}
	public List<Hospital> getDetails() {
		List<Hospital> pm=hospitalrepository.findAll();
		return pm;
	}
	public String UpdatedDetails(Hospital hospital) {
		hospitalrepository.save(hospital);
		return " update sucess";
		
	}
	public Optional<Hospital> getOneDetails(int id) {
		Optional<Hospital> b=hospitalrepository.findById(id);
		return b;
	}
	public void deleteDetails(int id) {
		hospitalrepository.deleteById(id);
		
	}
	
}
