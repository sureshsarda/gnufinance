package org.gnuport.gnufinance.modules.transaction.views;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;

import org.gnuport.gnufinance.beans.TransactionBean;
import org.gnuport.gnufinance.common.AbstractView;
import org.gnuport.gnufinance.common.mvc.annotations.MVCView;
import org.gnuport.gnufinance.modules.transaction.components.LedgerTransaction;
import org.gnuport.gnufinance.modules.transaction.controllers.LedgerController;
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
@MVCView(controller="org.gnuport.gnufinance.modules.transaction.controllers.LedgerController")
public class LedgerView extends AbstractView<LedgerController> {

    public static final String NAME = "ledger-view";
    
    private Logger logger = LoggerFactory.getLogger(LedgerView.class);

    public LedgerView(LedgerController controller) {
        this.controller = controller;
        
        this.setLayout(new FlowLayout());
        buildComponents();

        publishEvent(new LedgerViewLoadedEvent());
    }

    public void buildComponents() {

    }
    
    public void setLedgerData(List<TransactionBean> transactions) {
        for (TransactionBean transactionBean : transactions) {
            LedgerTransaction trans = new LedgerTransaction(transactionBean);
            this.add(trans);
        }
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public JPanel getLayoutRoot() {
        return this;
    }
}
