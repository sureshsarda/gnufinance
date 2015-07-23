package org.gnuport.gnufinance.services.jdbc;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.lf5.util.DateFormatManager;
import org.gnuport.gnufinance.beans.UserBean;
import org.gnuport.gnufinance.utils.NamedPreparedStatement;

/**
 *
 * @author Suresh Sarda
 */

public class UserService {
	public static List<UserBean> search(UserBean criteria) {
		Connection conn = JDBCSessionManager.getConnection();
		String query = "SELECT * from users WHERE rid=:rid, first_name=:fname, last_name=:lname";

		NamedPreparedStatement nps = new NamedPreparedStatement(conn, query);
		nps.setLong("rid", criteria.getRid());
		nps.setString("fname", criteria.getFirstName());
		nps.setString("lname", criteria.getLastName());

		
		// FIXME Implementation PENDING
		System.out.println(nps.getSqlQuery());

		return null;
	}

	public static void main(String[] args) {
		
		
		
	}
}
