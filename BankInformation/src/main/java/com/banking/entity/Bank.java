package com.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int staffid;
	String name;
	int staffcontatcno;
	
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaffcontatcno() {
		return staffcontatcno;
	}
	public void setStaffcontatcno(int staffcontatcno) {
		this.staffcontatcno = staffcontatcno;
	}
	
	
	
}
