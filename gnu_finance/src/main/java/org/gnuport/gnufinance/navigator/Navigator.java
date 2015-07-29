package org.gnuport.gnufinance.navigator;

import org.gnuport.gnufinance.common.AbstractView;

public class Navigator {
    
    private RootFrame root;
    
    protected Navigator(RootFrame root) {
        this.root = root;
    }
    
    public void navigate(AbstractView<?> view) {
        root.setContentPane(view);
    }
    
    
}
