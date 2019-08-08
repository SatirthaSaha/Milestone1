package com.example.stockspring.model;

public class Sector {

	private int sector_id;
	private String breifwriteup;
	private int stock_Code;
	public int getSector_id() {
		return sector_id;
	}
	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}
	public String getBreifwriteup() {
		return breifwriteup;
	}
	public void setBreifwriteup(String breifwriteup) {
		this.breifwriteup = breifwriteup;
	}
	public int getStock_Code() {
		return stock_Code;
	}
	public void setStock_Code(int stock_Code) {
		this.stock_Code = stock_Code;
	}
	public Sector(int sector_id, String breifwriteup, int stock_Code) {
		super();
		this.sector_id = sector_id;
		this.breifwriteup = breifwriteup;
		this.stock_Code = stock_Code;
	}
	public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
