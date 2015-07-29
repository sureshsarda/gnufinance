package org.gnuport.gnufinance.navigator;

import java.awt.Container;

import javax.swing.JFrame;

import org.gnuport.gnufinance.modules.transaction.controllers.LedgerController;
import org.gnuport.gnufinance.modules.transaction.views.LedgerView;

/**
 * 
 * @author Suresh Sarda
 *
 */
public class RootFrame  {
    
    protected JFrame root;
    private Navigator navigator;
    
    public RootFrame() {
    
        /*Initialize a new root layout*/
        root = new JFrame();
        root.setTitle("GNU Finance");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setSize(640, 480);
        root.setVisible(true);
        
        /*Initialize the navigator*/
        navigator = new Navigator(this);
        
        /*Navigate to first view*/
        LedgerView ledger = new LedgerView(LedgerController.getInstance());
        
        this.getNavigator().navigate(ledger);
//        GnuFinance.getGlobalEventBus().publish(this, new NewTransactionEvent());
    }
    
    private void buildLayout() {
        
    }
    
    protected void setContentPane(Container contentPane) {
        root.setContentPane(contentPane);
    }
    
    protected JFrame getRoot() {
        return this.root;
    }
    
    public Navigator getNavigator() {
        return this.navigator;
    }
    
}
