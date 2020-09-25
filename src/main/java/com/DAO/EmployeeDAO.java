package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Employee;
import com.controller.ConnectDb;

public class EmployeeDAO {
	public void addEmployee(Employee e)
	{	
		System.out.println("hema1"+e.getemailid());
		Connection con=null;
		PreparedStatement ps1=null;
		int n=0;

		con=ConnectDb.getConnection();
		System.out.println(con);
		try
		{
			ps1=con.prepareStatement("insert into employee_table values(?,?)");
			ps1.setString(1, e.getemailid());
			ps1.setString(2, e.getpassword());
			n=ps1.executeUpdate();
			System.out.println(n);
			
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();
		}
		finally
		{
			ConnectDb.closeStatement(ps1);
			ConnectDb.closeConnection(con);
		}
	
	}

}
