package org.gnuport.gnufinance.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
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

	public PreparedStatement getPreparedStatement() throws SQLException {
		return connection.prepareStatement(query);
	}

	public String getSqlQuery() {
		return query;
	}

}
