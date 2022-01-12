package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue (strategy  = GenerationType.IDENTITY)
	private int id;
  private  String pname;
	private String paddress;
	private int pno;
	public int getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public int getPno() {
		return pno;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}

	
	
	
	
}
