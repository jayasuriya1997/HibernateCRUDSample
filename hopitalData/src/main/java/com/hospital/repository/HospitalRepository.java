package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Hospital;

private interface Q extends JpaRepository<Hospital, Integer> {


}
