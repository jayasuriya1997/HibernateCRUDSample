package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dao.HospitalDao;
import com.hospital.entity.Hospital;
@Service
public class HospitalService {

	@Autowired
	HospitalDao hospitaldao;
	public String addPatientDetails(Hospital hospital) {
		
		return hospitaldao.addPatientDetails(hospital);
	}
	public List<Hospital> getDetails() {
		
		return hospitaldao.getDetails();
	}
	public String UpdatedDetails(Hospital hospital) {
		
		return hospitaldao.UpdatedDetails( hospital);
	}
	public Optional<Hospital> getOneDetails(int id) {
		
		return hospitaldao. getOneDetails(id);
	}
	public void deleteDetails(int id) {
		hospitaldao.deleteDetails(id);
		
	}

}
