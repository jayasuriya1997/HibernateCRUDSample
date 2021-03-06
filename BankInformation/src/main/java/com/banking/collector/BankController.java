package com.banking.collector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Bank;
import com.banking.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	BankService bankservice;

	@PostMapping("/add")
	public String addBankDetails(@RequestBody Bank bank) {
		return bankservice.addBankDetails(bank);
	}

	@GetMapping("/get")
	public List<Bank> getBank() {
		return bankservice.getBank();
	}

	@PutMapping("/update")
	public void updateBank(@RequestBody Bank bank) {
		bankservice.updateBank(bank);
	}

	@GetMapping("/one/{staffid}")
	public Optional<Bank> getONeBy(@PathVariable int staffid) {
		return bankservice.getONeBy(staffid);
	}

	@DeleteMapping("/delete/{staffid}")
	public void deleteBank(@PathVariable int staffid) {
		bankservice.deleteBank(staffid);
	}

	@GetMapping("/getid")
	public List<Integer> getiDBank() {
		return bankservice.getiDBank();
	}

	@GetMapping("/getname")
	public List<String> getstaffname() {
		return bankservice.getstaffname();
	}



}

