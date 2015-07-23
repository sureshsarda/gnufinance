package org.gnuport.gnufinance.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.lf5.util.DateFormatManager;

/**
 * NamedPreparedStatement helps to create SQL statements using symbols instead
 * of indexes as in vanilla prepared statement. A symbol is prefixed by a ':'
 * (colon). All the symbols must be replaced by their values before executing.
 * 
 * @author Suresh Sarda
 */

public class NamedPreparedStatement {

	String query;
	Connection connection;

	public NamedPreparedStatement(Connection connection, String query) {
		this.connection = connection;
		this.query = query;
	}

	public void setString(String symbol, String value) {
		symbol = ":" + symbol;
		value = "'" + value + "'";
		query = query.replaceAll(symbol, value);
	}

	public void setLong(String symbol, long value) {
		String val = Long.toString(value);
		setString(symbol, val);
	}

	public void setDate(String symbol, java.util.Date date) {
		DateFormatManager dfm = new DateFormatManager("yyyy-MM-dd");
		String strDate = dfm.format(date);
		setString(symbol, strDate);
	}

	public void setDate(String symbol, java.sql.Date date) {
		DateFormatManager dfm = new DateFormatManager("yyyy-MM-dd");
		String strDate = dfm.format(date);
		setString(symbol, strDate);
	}

	/*
	 * Return Objects
	 */
	public PreparedStatement getPreparedStatement() throws SQLException {
		return connection.prepareStatement(query);
	}

	public String getSqlQuery() {
		return query;
	}
	
	/*
	 * Statement Execution Routines
	 */
	public boolean execute() throws SQLException {
		PreparedStatement ps = connection.prepareStatement(query);
		return ps.execute();
	}
	
	public ResultSet executeQuery() throws SQLException {
		PreparedStatement ps = connection.prepareStatement(query);
		return ps.executeQuery();
	}
	
	public int executeUpdate() throws SQLException {
		PreparedStatement ps = connection.prepareStatement(query);
		return ps.executeUpdate();
	}

}
