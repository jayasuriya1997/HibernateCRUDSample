package com.book;

public class Book {

	
	private int bid;
	private String bname;
	private int bpages;
	
	public Book(int bid, String bname, int bpages) {
		this.setBid(bid);
		this.setBname(bname);
		this.setBpages(bpages);
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBpages() {
		return bpages;
	}

	public void setBpages(int bpages) {
		this.bpages = bpages;
	}
	
	
}
