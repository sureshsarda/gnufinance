package org.gnuport.gnufinance.modules.dashboard.views;

import java.awt.Container;

import javax.swing.JFrame;

/**
 * 
 * @author Suresh Sarda
 *
 */
public class RootFrame extends JFrame {
    public RootFrame() {
        
        this.setTitle("GNU Finance");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);
        this.setVisible(true);
    }
    
    private void buildLayout() {
        
    }
    
    public void setContentPane(Container contentPane) {
        this.setContentPane(contentPane);
    }
    
    
}
