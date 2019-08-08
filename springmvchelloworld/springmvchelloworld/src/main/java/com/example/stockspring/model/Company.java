package com.example.stockspring.model;

public class Company {

	private int company_code;
	private String boardOfDirectors;
	private String company_Name;
	private double turnover;
	private String ceo;
	private Sector sector;
	
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	public Company(int company_code, String boardOfDirectors, String company_Name, double turnover, String ceo,
			Sector sector) {
		super();
		this.company_code = company_code;
		this.boardOfDirectors = boardOfDirectors;
		this.company_Name = company_Name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.sector = sector;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "id:" + this.getCompany_code()+" directors:"+this.getBoardOfDirectors();
	}
	
}
