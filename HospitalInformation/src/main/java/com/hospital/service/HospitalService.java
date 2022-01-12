package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;

public class HospitalService {
	@Autowired
	HospitalDao hospitaldao;

	public String addPatientDetails(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitaldao.addPatientDetails(hospital);
	}

}
