package com.banking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.BankDao;
import com.banking.entity.Bank;

@Service
public class BankService {

	@Autowired
	BankDao bankdao;

	public String addBankDetails(Bank bank) {

		return bankdao.addBankDetails(bank) ;
	}

	public List<Bank> getBank() {
		// TODO Auto-generated method stub
		return bankdao.getBank();
	}

	public void updateBank(Bank bank) {
		bankdao.updateBank(bank);
		
	}

	public Optional<Bank> getONeBy(int staffid) {
		// TODO Auto-generated method stub
		return bankdao.getOneBy(staffid);
	}

	public void deleteBank(int staffid) {
		// TODO Auto-generated method stub
		bankdao.deleteBank(staffid);
	}

	public List<Integer>getiDBank(){
		return bankdao.getiDBank();
	}

	public List<String> getstaffname() {
		
		return bankdao.getstaffname() ;
	}
	
}
