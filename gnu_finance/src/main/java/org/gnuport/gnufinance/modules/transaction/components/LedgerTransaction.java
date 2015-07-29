package org.gnuport.gnufinance.modules.transaction.components;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.gnuport.gnufinance.beans.TransactionBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Suresh Sarda
 *
 */

@SuppressWarnings("serial")
public class LedgerTransaction extends JPanel {

    TransactionBean transaction;

    private Logger logger = LoggerFactory.getLogger(LedgerTransaction.class);

    public LedgerTransaction(TransactionBean transaction) {
        super();
        this.transaction = transaction;
        buildComponents();
    }

    private void buildComponents() {
         this.setBackground(Color.GREEN);

         JLabel label = new JLabel();
         label.setText(transaction.getDescription());
         
         this.add(label, BorderLayout.CENTER);


    }
}
