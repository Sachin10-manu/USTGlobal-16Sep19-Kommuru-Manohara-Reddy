package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class InsertQueryProperties {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			String sql = prop.getProperty("insert-query");
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
			System.out.println(count);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
