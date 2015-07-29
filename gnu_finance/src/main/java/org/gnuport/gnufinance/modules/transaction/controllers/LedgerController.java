package org.gnuport.gnufinance.modules.transaction.controllers;

import org.gnuport.gnufinance.GnuFinance;
import org.gnuport.gnufinance.common.AbstractController;
import org.gnuport.gnufinance.modules.transaction.events.LedgerViewLoadedEvent;
import org.gnuport.gnufinance.modules.transaction.views.LedgerView;
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
        GnuFinance.getInstance().getGlobalEventBus().subscribe(this, LedgerViewLoadedEvent.class);
    }
    
    public void onLedgerViewLoadedEvent(LedgerViewLoadedEvent e) {
        logger.debug("LedgerView Load Complete");
    }
    
    private static LedgerController instance = new LedgerController();
    public static LedgerController getInstance() {
        return instance;
    }
}
