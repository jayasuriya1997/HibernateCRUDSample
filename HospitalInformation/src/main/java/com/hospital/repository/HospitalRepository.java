package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.enitiy.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

	

}
