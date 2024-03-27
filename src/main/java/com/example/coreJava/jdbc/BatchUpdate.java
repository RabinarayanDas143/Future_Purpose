package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchUpdate extends JdbcConnection {
	public static void main(String[] args) throws SQLException {

		String query = "INSERT INTO EMPLOYEE (ID,NAME,ADDRESS) VALUES(?,?,?)";
		Scanner sc = new Scanner(System.in);
		Connection connection = JdbcConnection.getConnection();
		PreparedStatement ps = connection.prepareStatement(query);
		while (true) {
			System.out.println("Enter your id");
			int id = sc.nextInt();

			System.out.println("Enter your Name");
			String name = sc.next();

			System.out.println("Enter your address");
			String address = sc.next();

			System.out.println("You want to enter more data (Y/N)");
			String choice = sc.next();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);

			ps.addBatch();
			
			int[] arr = ps.executeBatch();

			if (choice.toUpperCase().equals("N")) {
				break;
			}
		}
	}
}
