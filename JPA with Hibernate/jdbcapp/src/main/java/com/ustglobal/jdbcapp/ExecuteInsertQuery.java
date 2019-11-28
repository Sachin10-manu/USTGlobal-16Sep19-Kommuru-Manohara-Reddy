package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//Step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Step 2 get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue Sql Query
			String sql = "insert into employee_info values('"+args[0]+"','"+args[1]+"','"+args[2]+"','"+args[3]+"')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the result			
			System.out.println(count + " Rows inserted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//Step 5 Close connections
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main()
}//end of ExecuteInsertQuery
