package com.java.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.java.miniproject.pojo.Hobby;
import com.java.miniproject.pojo.User;

public class DBManager {

	private Connection connect;

	public DBManager() {

	}// end of DB manager consatructor

	public Connection getConnection() {

		return connect;

	}// end of getconnection

	public void openConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project_db", "root", "root");
			System.out.println("DB connection sucsessfull");
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		}

	} // end of openconnection

	public void closeConnection() {

		try {
			connect.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		}
	}// end of closeconection

	public boolean validateUser(User nuser) {
		// connect to DB
		openConnection();
		// fire query

//		String query = "SELECT * FROM USER_INFO_TBL WHERE USER_USERNAME='" + uname + "' AND USER_PASSWORD='" + pass
//				+ "'";
		String query = "SELECT * FROM USER_INFO_TBL WHERE USER_USERNAME='" + nuser.getUname() + "' AND USER_PASSWORD='" + nuser.getPass()
				+ "'";
		
		Statement stmt;
		try {
			stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// validate output
			if (rs.next())
			{
				nuser.setId(rs.getInt(1));
				nuser.setFname(rs.getString(2));
				nuser.setLname(rs.getString(3));
				nuser.setEmail(rs.getString(4));				
				nuser.setMobile(rs.getString(5));
				return true;
			}
			else
				return false;

		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} finally {
			// close connection
			closeConnection();
		}
		return false;

	}

	// for debug only
//	public static void main(String[] args) {
//
//		DBManager obj = new DBManager();
//
//		boolean result = obj.validateUser("anil", "anil@123");
//		System.out.println(result);
//
//	}

	public void createUser(User nUser) {
		// connect to DB
		openConnection();
		// fire query

		// insert into user_info_tbl
		// values(1,"Anil","Patil","a@gmail.com",9988776655,"anil","anil@123");

		//String query = "INSERT INTO USER_INFO_TBL(user_firstname,user_lastname,user_email,user_mobile,user_username,user_password) VALUES(?,?,?,?,?,?)";
		String query = "INSERT INTO USER_INFO_TBL VALUES(DEFAULT,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = connect.prepareStatement(query);
			pstmt.setString(1, nUser.getFname());
			pstmt.setString(2, nUser.getLname());
			pstmt.setString(3, nUser.getEmail());
			pstmt.setString(4, nUser.getMobile());
			pstmt.setString(5, nUser.getUname());
			pstmt.setString(6, nUser.getPass());
			pstmt.executeUpdate();

			

		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} finally {
			// close connection
			closeConnection();
		}
		

	}//end of create user
	
	public void addHobby(Hobby hb)
	{
		
		openConnection();
		// fire query

		// insert into user_info_tbl
		// values(1,"Anil","Patil","a@gmail.com",9988776655,"anil","anil@123");

		String query = "INSERT INTO HOBBY_TBL VALUES(DEFAULT,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = connect.prepareStatement(query);
			pstmt.setInt(1, hb.getHobby_uid());
			pstmt.setString(2, hb.getHobby_name());
			pstmt.executeUpdate();

			

		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} finally {
			// close connection
			closeConnection();
		}
		
		
	}// end of add hobby
	
	public ArrayList<String> viewHobby(Hobby hb) {
		// connect to DB
		openConnection();
		// fire query

//		String query = "SELECT * FROM USER_INFO_TBL WHERE USER_USERNAME='" + uname + "' AND USER_PASSWORD='" + pass
//				+ "'";
		String query = "SELECT * FROM HOBBY_TBL WHERE hobby_userid='" + hb.getHobby_uid()+"'";
		ArrayList<String> list =new ArrayList<>();
		Statement stmt;
		try {
			stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			// validate output
			if (rs.next())
			{
				  
				
				list.add(rs.getString(3));
				
			}
			
			
		} catch (SQLException e) {
			System.err.println(e.getMessage()); // this will print eror message in different colour for attention
			e.printStackTrace();
		} finally {
			// close connection
			
			closeConnection();
		}
		return list;

	}

}
