package com.example.coreJava.jdbc;

import java.sql.*;

public class JdbcConnection {
	private static final String url = "jdbc:oracle:thin:@203.112.157.164:1521:orcl";
	private static final String userName = "DEBITCAD_RECON";
	private static final String password = "DEBITCAD_RECON";
	private static Connection connection;

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("orcle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  connection = DriverManager.getConnection(url, userName, password);
		  connection.setAutoCommit(true);
		// String sql = "SELECT * FROM EMPLOYEE";
		//String sql = "INSERT INTO EMPLOYEE (ID,NAME,ADDRESS) VALUES(?,?,?)";
		//PreparedStatement ps = connection.prepareStatement(sql);
		//ps.setInt(1, 15);
		//ps.setString(2, "Aman");
		//ps.setString(3, "Odsha");
        //int rowAffected = ps.executeUpdate();
		//ResultSet resultSet = ps.executeQuery();
		//System.out.println("size of resultset :" + resultSet.getFetchSize());
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
