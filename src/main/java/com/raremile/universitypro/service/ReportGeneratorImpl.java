package com.raremile.universitypro.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportGeneratorImpl implements ReportGenerator {

	public void generateReport(int studentID) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/universityproject?user=root");
			pstmt = connection.prepareStatement("SELECT * FROM marks WHERE marks.sid = ?");
			pstmt.setInt(1, studentID);
			resultSet = pstmt.executeQuery();

			// Iterate the result set
			System.out.println("StudentID - " + studentID);
			while (resultSet.next()) {
				String result = "";
				if ((resultSet.getInt(3) + resultSet.getInt(4)) >= 50) {
					result = "PASS";
				} else {
					result = "FAIL";
				}
				System.out.println("Course ID = " + resultSet.getInt(2) + " ,Marks (Year-1) = " + resultSet.getInt(3)
						+ " ,Marks (Year-2) = " + resultSet.getInt(4) + " ,Result = " + result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
