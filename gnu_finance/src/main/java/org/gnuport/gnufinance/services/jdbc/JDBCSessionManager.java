package org.gnuport.gnufinance.services.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSessionManager {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/gnufinance";
	private static final String USERNAME = "gnufinance";
	private static final String PASSWORD = "gnuisnotunix";

	public static Connection connect() {
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
