package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class admin {
	
	public static String URL = "jdbc:mysql://localhost:3306/stockdb";
	public static String username = "root";
	public static String password = "hadihaidar@6";
	
	public static int NextCompanyID=getNextCompanyID();

	
	
	public static int getNextCompanyID() {

		
		try {Connection myConn = DriverManager.getConnection(URL, username, password);

		String get_CI="SELECT MAX( `Company_ID` ) FROM `company` ;";
		
		Statement st = myConn.createStatement();
	
		ResultSet rs= st.executeQuery(get_CI);
		rs.next();
		int x=Integer.parseInt(rs.getString(1));
		st.close();
		return x;
	}
	catch (SQLException e) {
		System.err.println(e.getMessage());
		return 0;
		}
		
	}
	
	public static void UpdatePrice(int C,double P) {
		
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		String q = "UPDATE Stock SET Share_Price= Share_price*"+P+" WHERE Company_ID="+C;
		Statement st = myConn.createStatement();
		int a = st.executeUpdate(q);
		st.close();
	}
	catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	
}

		
	
	

	
	public static void Insert_Stock(double P,int ID) {

		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		
			String q = "INSERT INTO stock (Company_ID,Share_price) VALUES (\""+ID+"\", \""+P+"\");";
			Statement st = myConn.createStatement();
			int a = st.executeUpdate(q);
			st.close();
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static boolean Check(String N,int ID) {

		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		String q = "Select Company_Name From company where Company_Name=\""+N+"\"AND Company_ID=\""+ID+"\"";
		Statement st = myConn.createStatement();
		ResultSet rs= st.executeQuery(q);
		boolean x=rs.next()==true;
		st.close();
		return x;}
		
		catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	

	public static void Insert_Company(String N,String A) {

		try {Connection myConn = DriverManager.getConnection(URL, username, password);
			String q = "INSERT INTO company (Company_Name,Company_Address) VALUES (\""+N+"\", \""+A+"\");";
			String get_CI="Select Company_ID From company WHERE Company_Name=\""+N+"\"";
			
			Statement st = myConn.createStatement();
			int a = st.executeUpdate(q);
			st.close();
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
