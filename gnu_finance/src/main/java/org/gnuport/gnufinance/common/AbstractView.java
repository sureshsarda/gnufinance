package org.gnuport.gnufinance.common;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

import org.gnuport.gnufinance.GnuFinance;

public abstract class AbstractView<C extends AbstractController> extends JPanel{
    
    
    public abstract String getName();
    public abstract JPanel getLayoutRoot();
    
    public AbstractView() {
        super();
        this.setVisible(true);
        this.setBackground(Color.WHITE);
    }
    
    private void publishEvent(Event e) {
        GnuFinance.getInstance().getGlobalEventBus().publish(this, e);
    }
    
    
}
