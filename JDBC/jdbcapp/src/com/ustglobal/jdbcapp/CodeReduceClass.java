package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class CodeReduceClass {
	public static void main(String[] args) {
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
		
		try (FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("select-query");
			try(Connection conn = DriverManager.getConnection(url, prop);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);){
					while(rs.next()) {
						System.out.println("Id: "+rs.getInt("id"));
						System.out.println("Nmae: "+rs.getString("name"));
						System.out.println("Salary: "+rs.getInt("sal"));
						System.out.println("Gender: "+rs.getString("gender"));
					}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
