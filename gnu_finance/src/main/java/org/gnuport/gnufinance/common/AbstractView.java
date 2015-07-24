package org.gnuport.gnufinance.common;

import javax.swing.JPanel;

import org.gnuport.gnufinance.GnuFinance;

public abstract class AbstractView<C extends AbstractController<?>>{
    
    
    public abstract String getName();
    public abstract JPanel getLayoutRoot();
    
    private void publishEvent(Event e) {
        GnuFinance.getGlobalEventBus().publish(this, e);
    }
    
    
}
