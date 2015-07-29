package org.gnuport.gnufinance.services.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.gnuport.gnufinance.beans.TransactionBean;
import org.gnuport.gnufinance.utils.NamedPreparedStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Suresh Sarda
 *
 */

public class TransactionService {

    private static Logger logger = LoggerFactory.getLogger(TransactionService.class);

    public static List<TransactionBean> retriveTransactions(TransactionBean filter) {
        Connection conn = JDBCSessionManager.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM gnufinance.transactions WHERE ");
        sb.append("rid like :rid AND ");
        sb.append("user_id like :uid AND ");
        sb.append("description like :desc AND ");
        sb.append("amount like :amount AND ");
        sb.append("date like :date;");
        String query = sb.toString();

        NamedPreparedStatement nps = new NamedPreparedStatement(conn, query);

        /* Replace all the symbols */
        // rid
        if (filter.getId() == 0) {
            nps.setString("rid", "%");
        } else {
            nps.setLong("rid", filter.getId());
        }

        // user id
        if (filter.getBelongsToUser() != null) {
            nps.setLong("uid", filter.getBelongsToUser().getRid());
        } else {
            nps.setString("uid", "%");
        }
        // description
        nps.setString("desc", filter.getDescription() == null ? "%" : filter.getDescription());

        // amount
        if (filter.getAmount() == 0) {
            nps.setString("amount", "%");
        } else {
            nps.setLong("amount", filter.getAmount());
        }

        // date
        if (filter.getDate() == null) {
            nps.setString("date", "%");
        } else {
            nps.setDate("date", filter.getDate());
        }

        logger.debug("SQL Query Generated: " + nps.getSqlQuery());

        List<TransactionBean> transactions = new ArrayList<TransactionBean>();
        try {
            ResultSet rs = nps.executeQuery();
            while (rs.next()) {
                TransactionBean transaction = new TransactionBean();
                transaction.setId(rs.getLong(1));
                transaction.setDescription(rs.getString(3));
                transaction.setAmount(rs.getLong(4));
                transaction.setDate(rs.getDate(5));
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            logger.error("Exception", e);
        } finally {
            nps.destroy();
        }
        logger.debug("Transactions returned: " + transactions.size());
        return transactions;
    }
}
