package org.gnuport.gnufinance.modules.transaction.controllers;

import org.gnuport.gnufinance.GnuFinance;
import org.gnuport.gnufinance.common.AbstractController;
import org.gnuport.gnufinance.common.AbstractView;
import org.gnuport.gnufinance.modules.transaction.events.LedgerViewLoadedEvent;

/**
 *
 * @author Suresh Sarda
 * @param <T>
 *
 */

public class TransactionController extends AbstractController {
    public TransactionController() {
        GnuFinance.getInstance().getGlobalEventBus().subscribe(this, LedgerViewLoadedEvent.class);
    }
    
    
    public void onLedgerViewLoadedEvent(LedgerViewLoadedEvent event) {
        System.out.println("Load Complete");
    }

    private static TransactionController instance = new TransactionController();
    public static synchronized TransactionController getInstance() {
        return instance;
    }
}
