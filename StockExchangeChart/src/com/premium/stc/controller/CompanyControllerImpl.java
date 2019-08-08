package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Company;
import com.premium.stc.service.CompanyService;
import com.premium.stc.service.CompanyServiceImpl;

public class CompanyControllerImpl implements CompanyController {

	private CompanyService companyService=new CompanyServiceImpl();
	@Override
	public Company insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		companyService.insertCompany(company);
		return company;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws Exception {
		// TODO Auto-generated method stub
		return companyService.getCompanyList();
	}
	
	public static void main(String args[])
	{
		CompanyController controller= new CompanyControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
