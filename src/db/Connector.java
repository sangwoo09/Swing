package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	public static Connection makeConn() {
		String url = "jdbc:mysql://localhost/car";
		
		Connection con = null;
		
		String id = "root";
		String pw = "";
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		makeConn();
	}
}
