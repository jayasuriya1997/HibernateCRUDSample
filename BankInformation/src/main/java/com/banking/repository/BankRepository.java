package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

	

	@Query(value = "SELECT b.staffid from bank b", nativeQuery = true)
	List<Integer> getiDBank();
	
	
	@Query(value = "SELECT * FROM bank WHERE NAME LIKE 'a%'", nativeQuery = true)
	List<String> getstaffname();





}
