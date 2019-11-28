package com.ustglobal.mobileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.ustglobal.mobileapp.dto.Person;

public class MobileApp implements MobileDao {

	@Override
	public List<Person> showAllContact() {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact";

		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){

			List<Person> lt = new ArrayList<Person>();
			while(rs.next()) {
				Person p = new Person();
				p.setName(rs.getString("name"));
				lt.add(p);
			}
			return lt;
		}

		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addcontact() {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "insert into contact values(?,?,?,?)";

		try (Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql);)
				{

			Person p = new Person();
			pstmt.setString(1, p .getName());
			pstmt.setLong(2, p.getPhonenumber());
			pstmt.setString(3, p.getGroups());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletecontact() {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "delete from contact where name=?";

		try (Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql);)
				{

			Person p = new Person();
			pstmt.setString(1, p .getName());
			
			System.out.println(pstmt.executeUpdate());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean editcontact() {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "update employee_info set phonenumber=?,groups=? where name=?";

		try (Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql);)
				{

			Person p = new Person();
			pstmt.setLong(1, p.getPhonenumber());
			pstmt.setString(2, p.getGroups());
			pstmt.setString(3, p.getName());
			
			System.out.println(pstmt.executeUpdate());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
