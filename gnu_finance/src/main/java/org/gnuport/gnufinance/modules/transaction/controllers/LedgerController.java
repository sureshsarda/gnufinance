package org.gnuport.gnufinance.modules.transaction.controllers;

import java.util.List;

import org.gnuport.gnufinance.GnuFinance;
import org.gnuport.gnufinance.beans.TransactionBean;
import org.gnuport.gnufinance.common.AbstractController;
import org.gnuport.gnufinance.modules.transaction.events.LedgerViewLoadedEvent;
import org.gnuport.gnufinance.modules.transaction.views.LedgerView;
import org.gnuport.gnufinance.services.jdbc.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Suresh Sarda
 *
 */

public class LedgerController extends AbstractController<LedgerView> {
    
    private Logger logger = LoggerFactory.getLogger(LedgerController.class);
    
    public LedgerController() {
//        GnuFinance.getInstance().getGlobalEventBus().subscribe(this, LedgerViewLoadedEvent.class);
    }
    
    public void onLedgerViewLoadedEvent(Object sender, LedgerViewLoadedEvent e) {
        System.out.println("Loaded");
        List<TransactionBean> list = TransactionService.retriveTransactions(new TransactionBean());
        getView(sender).setLedgerData(list);
    }
    
    
    private static LedgerController instance = new LedgerController();
    public static LedgerController getInstance() {
        return instance;
    }
}
