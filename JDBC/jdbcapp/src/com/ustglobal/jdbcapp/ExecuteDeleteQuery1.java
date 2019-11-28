package com.ustglobal.jdbcapp;

import java.sql.*;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery1 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into employee_info values(5,'shruthi',100000,'F')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count);

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
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
	}
}
