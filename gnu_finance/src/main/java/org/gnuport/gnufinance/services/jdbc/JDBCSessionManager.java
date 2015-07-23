package org.gnuport.gnufinance.services.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCSessionManager {

	private static Logger logger = LoggerFactory
			.getLogger(JDBCSessionManager.class);

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/gnufinance";
	private static final String USERNAME = "gnufinance";
	private static final String PASSWORD = "gnuisnotunix";

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e1) {
			logger.trace(e1.getMessage());
		} catch (SQLException e) {
			logger.trace(e.getMessage());
		}
		logger.warn("Returning null connection");
		return null;
	}
}
