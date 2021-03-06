package com.banking.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banking.entity.Bank;
import com.banking.repository.BankRepository;

@Repository
public class BankDao {

	@Autowired
	BankRepository bankrepository;

	public String addBankDetails(Bank bank) {
		bankrepository.save(bank);
		return "sucess";
	}

	public List<Bank> getBank() {
		List<Bank> list = bankrepository.findAll();
		return list;
	}

	public void updateBank(Bank bank) {
		bankrepository.save(bank);

	}

	public Optional<Bank> getOneBy(int staffid) {

		Optional<Bank> op = bankrepository.findById(staffid);
		return op;
	}

	public void deleteBank(int staffid) {
		// TODO Auto-generated method stub
		bankrepository.deleteById(staffid);
	}

	public List<Integer> getiDBank() {
		return bankrepository.getiDBank();
	}

	public List<String> getstaffname() {
		
		return bankrepository.getstaffname();
	}

}
