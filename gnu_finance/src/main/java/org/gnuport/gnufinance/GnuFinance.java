package org.gnuport.gnufinance;

import java.awt.EventQueue;

import org.gnuport.gnufinance.common.EventBus;
import org.gnuport.gnufinance.navigator.Navigator;
import org.gnuport.gnufinance.navigator.RootFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GnuFinance {

    private static GnuFinance thisInstance;
    
    private static Logger logger = LoggerFactory.getLogger(GnuFinance.class);
    private EventBus eventBus;
    private RootFrame rootFrame;

    public static void main(String[] args) {
        
        thisInstance = new GnuFinance();
    }


    public GnuFinance() {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                eventBus = new EventBus();
                rootFrame = new RootFrame();
            }
        });
        
    }

    public RootFrame getRootFrame() {
        return this.rootFrame;
    }
    
    public EventBus getGlobalEventBus() {
        return eventBus;
    }
    
    public static GnuFinance getInstance() {
        if (thisInstance != null) {
            return thisInstance;
        }
        logger.error("GnuFinance instance was not running.");
        return null;
    }
    
    public static Navigator getNavigator() {
        return GnuFinance.getInstance().getRootFrame().getNavigator();
    }
}
