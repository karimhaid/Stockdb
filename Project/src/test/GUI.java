package test;

import java.sql.*;

public class GUI {
	private static String currentSSN;
	public static String currentUser;
	public static Integer Stock_ID;
	public static Integer Company_ID;
	
	public static String URL = "jdbc:mysql://localhost:3306/stockdb";
	public static String username = "root";
	public static String password = "hadihaidar@6";
	
	public static void Insert(String S,String F, String L,String E, String A,String I) {
		currentSSN=S;
		currentUser=L;
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
			String q = "INSERT INTO investor VALUES (\""+S+"\", \""+F+"\", \""+L+"\",\""+E+"\",\""+A+"\",\""+I+"\");";
			Statement st = myConn.createStatement();
			int a = st.executeUpdate(q);
			st.close();
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}
	public static void InsertBank(int A,int R, String B,String T) {
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
			String q = "INSERT INTO bank VALUES (\""+A+"\", \""+currentSSN+"\", \""+R+"\",\""+B+"\",\""+T+"\");";
			Statement st = myConn.createStatement();
			int a = st.executeUpdate(q);
			st.close();
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static boolean Check(String S, String L) {
		currentSSN=S;
		currentUser=L;
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		String q = "Select SSN From investor where SSN=\""+S+"\"AND LastName=\""+L+"\"";
		Statement st = myConn.createStatement();
		ResultSet rs= st.executeQuery(q);
		boolean x=rs.next()==true;
		st.close();
		return x;
	}
	catch (SQLException e) {
		System.err.println(e.getMessage());
		return false;
	}
		
		
	}
	public static ResultSet getStocks() {
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		String q = "Select S.Company_ID, Company_Name,Stock_ID,Share_price From stock S,Company C where S.Company_ID=C.Company_ID";
		Statement st = myConn.createStatement();
		ResultSet rs= st.executeQuery(q);
		
		return rs;
	}
		catch (SQLException e) {
			System.err.println(e.getMessage());
			
			return null;
		}
		
		
	}
	
	public static void Buy_Stock(Integer Share) {
		
		try {Connection myConn = DriverManager.getConnection(URL, username, password);
		String q = "INSERT INTO buys_stock(SSN,Stock_ID,Company_ID,Share) VALUES (\""+currentSSN+"\", \""+Stock_ID+"\",\""+Company_ID+"\",\""+Share+"\");";
		Statement st = myConn.createStatement();
		 st.executeUpdate(q);
		

	}
		catch (SQLException e) {
			System.err.println(e.getMessage());
			

		}
		
	}
	public static void main(String[] args) {
		
//			String q = "INSERT INTO investor VALUES (\"39-123-1241\", \"mhmd\", \"haidar\",\"h@gmail.com\",\"yimger\",\"investor\");";
//			String g = "SELECT* FROM investor";
//			Statement st = myConn.createStatement();
//			int a = st.executeUpdate(q);
//			ResultSet rs = st.executeQuery(g);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int Cn = rsmd.getColumnCount();
//			while (rs.next()) {
//				for (int i = 1; i <= Cn; i++) {
//
//					System.out.print(rs.getString(i) + " "); // Print one element of a row
//
//				}
//
//				System.out.println();// Move to the next line to print the next row.
//
//			}
//
//		} catch (SQLException e) {
//			System.err.println(e.getMessage());
//		}

	}

}
