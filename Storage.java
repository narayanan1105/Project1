package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Storage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertData();
		getData();
	}
	
	public static void insertData(){
		String name="venki";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/swami","root","");
			
			PreparedStatement stmt=c.prepareStatement("insert into student values(?,?)");
		
			stmt.setString(1, "8");
			stmt.setString(2, name);
			stmt.execute();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public static void getData(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/swami","root","");
			
			Statement stmt=c.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
	

}
