package org.gnuport.gnufinance.modules.transaction.controllers;

import java.util.List;

import org.gnuport.gnufinance.GnuFinance;
import org.gnuport.gnufinance.beans.TransactionBean;
import org.gnuport.gnufinance.common.AbstractController;
import org.gnuport.gnufinance.modules.transaction.events.NewTransactionEvent;
import org.gnuport.gnufinance.modules.transaction.views.AddNewTransactionView;
import org.gnuport.gnufinance.services.jdbc.TransactionService;

/**
 *
 * @author Suresh Sarda
 * @param <T>
 *
 */

public class TransactionController extends AbstractController {
    public TransactionController() {
        GnuFinance.getInstance().getGlobalEventBus().subscribe(this, NewTransactionEvent.class.getName());
    }
    
    
    @Override
    protected void preViewLoad() {
        
    }
}
