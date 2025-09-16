package com.tnsif.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	private static String URL = "jdbc:postgresql://localhost:PORT_NUMBER/DATABASE_NAME";    
	private static String UserName = "USERNAME";
	private static String Password = "DB_PASSWORD";
	// Used PORT_NUMBER, DATABASE_NAME, USERNAME, DB_PASSWORD for security purpose 
	// Use actual data in real time project
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Step 1--> Loading the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
//		Step 2--> Establishing the connection
		Connection con=DriverManager.getConnection(URL, UserName, Password);
		System.out.println("Connection Established");
		
//		Step 3--> Creating statements
		Statement stmt =con.createStatement();
		String query = "select * from employee";
		
		String query2 = "insert into employee values(105,'Mahesh',700000)";
		PreparedStatement pst = con.prepareStatement(query2);
		pst.execute();
		System.out.println("One new row added");
		
		
//		Step 4--> Executing the query 
		ResultSet rs = stmt.executeQuery(query);
		
//		Step 5--> Retrieving the data 
		while(rs.next()) {
			int empid = rs.getInt(1);
			String empname = rs.getString(2);
			int empsalary = rs.getInt(3);
			System.out.println(+empid+ " " +empname+ " "+empsalary);
		}
		
	}

}
