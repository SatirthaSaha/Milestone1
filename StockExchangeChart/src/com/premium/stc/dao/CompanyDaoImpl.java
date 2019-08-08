package com.premium.stc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.premium.stc.model.Company;
import com.premium.stc.model.Sector;

public class CompanyDaoImpl implements CompanyDao{

	@Override
	public boolean insertCompany(Company company) throws SQLException  {
		boolean flag=false;
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satirtha","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("insert into company (company_Code,company_Name, turnover, ceo, boardofdirectors, sector_id, breifwriteup, stock_Code) values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, company.getCompany_code());
		ps.setString(2, company.getCompany_Name());
		ps.setDouble(3, company.getTurnover());
		ps.setString(4, company.getCeo());
		ps.setString(5, company.getBoardOfDirectors());
		System.out.println(company.getSector().getSector_id());
		ps.setInt(6, company.getSector().getSector_id());
		ps.setString(7, company.getSector().getBreifwriteup());
		ps.setInt(8, company.getSector().getStock_Code());
		boolean rs=	ps.execute();
		flag=true;
		}catch(SQLException sql)
		{
			flag=false;
		}
		return flag;
		
	}

	@Override
	public boolean updateCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=true;
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satirtha","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("update company set turnover=?, ceo=?, boardofdirectors=?, sector_id=?, breifwriteup=?, stock_Code=? where company_Code=?");
		ps.setDouble(1, company.getTurnover());
		ps.setString(2, company.getCeo());
		ps.setString(3, company.getBoardOfDirectors());
		ps.setInt(4, company.getSector().getSector_id());
		ps.setString(5, company.getSector().getBreifwriteup());
		ps.setInt(6, company.getSector().getStock_Code());
		ps.setInt(7, company.getCompany_code());
		boolean rs=ps.execute();
		flag=true;
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
			flag=false;
		}
		return flag;
		
	}
	
	public static void main(String []args) throws Exception{
		CompanyDao dao=new CompanyDaoImpl(); 
		Company company=new Company();
		 /* compnay.setCompanyId(1001);
		 */
		//dao.insertCompany(compnay);
		Random r = new Random();
		int num = r.nextInt(900000) + 100000;
		company.setCompany_code(num);
		company.setCompany_Name("IBM");
		company.setTurnover(3.2);
		company.setCeo("Abc");
		company.setBoardOfDirectors("abc");
		Sector sector =new Sector();
		sector.setSector_id(1001);
		sector.setBreifwriteup("abcdef");
		sector.setStock_Code(100);
		company.setSector(sector);
		if(dao.insertCompany(company))
			System.out.println("Insertion successful");
		else
			System.out.println("Unsuccessful insertion");
		System.out.println(dao.getCompanyList());
		company.setTurnover(4.2);
		company.setCeo("bcd");
		company.setBoardOfDirectors("abcde");
		sector.setSector_id(1002);
		sector.setBreifwriteup("abcdef");
		sector.setStock_Code(100);
		company.setSector(sector);
		if(dao.updateCompany(company))
			System.out.println("Successful updation");
		else
			System.out.println("Unsuccessful updation");
		System.out.println(dao.getCompanyList());
	}
	
	public List<Company> getCompanyList() throws SQLException{
		System.out.println("inside list dao");
		List <Company> companyList=new ArrayList<Company>();
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satirtha","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 int companyId=rs.getInt("company_code");
			company.setCompany_code(companyId);
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			companyList.add(company);
		}
		}catch(SQLException e)
		{
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	

}