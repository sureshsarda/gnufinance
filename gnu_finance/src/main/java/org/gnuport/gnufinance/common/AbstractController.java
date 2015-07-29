package org.gnuport.gnufinance.common;


/**
 * <h1>AbstractController</h1>
 * <p>
 * Template for all the controllers. This template ensures that view and controllers go hand in hand.
 * 
 * The type in the declaration is to tell the controller what type of views it is going to listen to. The view must be
 * passed an instance of the controller.
 * </p>
 * 
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */
public abstract class AbstractController<VType extends AbstractView<?>> implements EventBusListener {

}
