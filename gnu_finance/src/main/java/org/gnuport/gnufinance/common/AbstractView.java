package org.gnuport.gnufinance.common;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JPanel;

import org.gnuport.gnufinance.GnuFinance;

@SuppressWarnings("serial")
public abstract class AbstractView<CType extends AbstractController<?>> extends JPanel {

    protected CType controller;

    public abstract String getName();

    public abstract JPanel getLayoutRoot();

    public AbstractView() {
        this.setBackground(Color.WHITE);
    }

    
    protected void publishEvent(Event e) {
        GnuFinance.getInstance().getGlobalEventBus().publish(this, e);
        
        try {
            Method m = controller.getClass().getMethod("on" + e.getClass().getSimpleName(), e.getClass());
            m.invoke(controller, e);
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (SecurityException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
    }


}
