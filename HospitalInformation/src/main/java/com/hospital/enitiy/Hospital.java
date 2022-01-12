package com.hospital.enitiy;

import javax.persistence.Entity;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	int pno;
	String pname;
	int bno;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

}
