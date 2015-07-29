package org.gnuport.gnufinance.modules.transaction.views;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;

import org.gnuport.gnufinance.beans.TransactionBean;
import org.gnuport.gnufinance.common.AbstractView;
import org.gnuport.gnufinance.modules.transaction.components.LedgerTransaction;
import org.gnuport.gnufinance.modules.transaction.controllers.LedgerController;
import org.gnuport.gnufinance.modules.transaction.controllers.TransactionController;
import org.gnuport.gnufinance.modules.transaction.events.LedgerViewLoadedEvent;
import org.gnuport.gnufinance.services.jdbc.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */

@SuppressWarnings("serial")
public class LedgerView extends AbstractView<LedgerController> {

    private Logger logger = LoggerFactory.getLogger(LedgerView.class);

    public LedgerView(LedgerController controller) {
        this.controller = controller;
        
        this.setLayout(new FlowLayout());
        buildComponents();

        publishEvent(new LedgerViewLoadedEvent());
    }

    public void buildComponents() {
        List<TransactionBean> list = TransactionService.retriveTransactions(new TransactionBean());
        for (TransactionBean transactionBean : list) {
            add(new LedgerTransaction(transactionBean));


        }

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JPanel getLayoutRoot() {
        // TODO Auto-generated method stub
        return null;
    }
}
