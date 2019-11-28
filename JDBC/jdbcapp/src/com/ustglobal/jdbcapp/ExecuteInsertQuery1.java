package com.ustglobal.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery1 {
	public static void main(String[] args) {
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Step 2 get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue Sql Query
			String sql = "insert into employee_info values(?,?,?,?)";
			// stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String salary = args[2];
			int sal = Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
;			// int count = stmt.executeUpdate(sql);
			
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
				//if(stmt!=null) {
					//stmt.close();
				//}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
