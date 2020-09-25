package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectDb {
	public static Connection getConnection(){
		Connection con = null;
		try {
			//Registering Driver
			Class.forName("org.postgresql.Driver");  //throws ClassNotFoundException (Checked Exception)
			
			//Creating Connection
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","Siva@1217"); //throws SQLException (Checked Exception)
		} catch (ClassNotFoundException ex) {

			System.out.println("connection not establisted" + ex);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		return con;
	}

	public static void closeConnection(Connection con) {

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println(e1);
			}
		}
	}

	// close statements
	public static void closeStatement(Statement smt) {

		if (smt != null) {
			try {
				smt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println(e1);
			}
		}
	}

}
