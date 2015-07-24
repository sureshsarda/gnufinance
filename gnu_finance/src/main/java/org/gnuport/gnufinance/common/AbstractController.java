package org.gnuport.gnufinance.common;

/**
 * <h1>AbstractController</h1>
 * <p>
 * Template for all the controllers. This template ensures that view and controllers go hand in hand.
 * </p>
 * 
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */
public abstract class AbstractController<V extends AbstractView<?>> implements EventBusListener {

    protected abstract void preViewLoad();
}
