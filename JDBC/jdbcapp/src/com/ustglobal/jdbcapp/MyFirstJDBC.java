package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Step2 Get Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			// String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url, "root", "root");
			
			// Step 3 Issue Sql Query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			// Step 4 Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("=======================");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			// Step 5 Close all JDBC connections
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}

