package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.dao.CompanyDao;
import com.premium.stc.dao.CompanyDaoImpl;
import com.premium.stc.model.Company;

public class CompanyServiceImpl implements CompanyService{

	private CompanyDao companyDao= new CompanyDaoImpl();
	
	 public boolean insertCompany(Company company)throws SQLException{		 
		return companyDao.insertCompany(company);
	 }
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Company> getCompanyList() throws Exception {
		// TODO Auto-generated method stub
		return companyDao.getCompanyList();
	}
}
