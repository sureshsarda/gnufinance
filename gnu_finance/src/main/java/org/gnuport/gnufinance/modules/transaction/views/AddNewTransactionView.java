package org.gnuport.gnufinance.modules.transaction.views;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.gnuport.gnufinance.common.AbstractView;
import org.gnuport.gnufinance.modules.transaction.controllers.TransactionController;

public class AddNewTransactionView extends AbstractView<TransactionController> {
    
    public static final String name = "new-transaction-view";
    
    public AddNewTransactionView() {
        super();
        
        JLabel label = new JLabel("Test");
        this.add(label);
        
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public JPanel getLayoutRoot() {
        return null;
    }

}
