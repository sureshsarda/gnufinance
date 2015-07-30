package org.gnuport.gnufinance.navigator;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.gnuport.gnufinance.common.AbstractController;
import org.gnuport.gnufinance.common.AbstractView;
import org.gnuport.gnufinance.common.mvc.annotations.MVCView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */

public class Navigator {

    Map<String, AbstractView<?>> views;

    private Logger logger = LoggerFactory.getLogger(Navigator.class);

    private RootFrame root;

    protected Navigator(RootFrame root) {
        this.root = root;

        views = new HashMap<String, AbstractView<?>>();
    }

    public void navigate(String viewClassName) {
        if (views.containsKey(viewClassName)) {
            Object view = views.get(viewClassName);
            root.setContentPane(((AbstractView) view).getLayoutRoot());
        } else {
            logger.info("Register a class before navigating to it. Navigation Failed.");
        }
    }

    public boolean register(AbstractView<?> view) {
        if (views.containsKey(view.getClass().getName()) == false) {
            views.put(view.getClass().getName(), view);
            return true;
        }
        else {
            logger.info("Trying to re-register a view. Failed.");
            return false;
        }      
    }
//    public boolean register(String viewClassName) {
//        try {
//            Class<?> viewClass = Class.forName(viewClassName);
//            MVCView viewAnnotation = viewClass.getAnnotation(MVCView.class);
//            Class<?> controllerClass = null;
//            if (viewAnnotation != null) {
//                String controllerName = viewAnnotation.controller();
//                controllerClass = Class.forName(controllerName);
////                Constructor<?> viewConstructor = viewClass.getConstructor(AbstractController.class);
//                Constructor<?>[] viewConstructors = viewClass.getConstructors();
//                for (Constructor<?> constructor : viewConstructors) {
//                    
//                }
//                
//                Constructor<?> controllerConstructor = controllerClass.getConstructor(null);
//
//                Object controller = controllerConstructor.newInstance();
//                Object view = viewConstructor.newInstance(controller);
//
//                if (view.getClass().getSuperclass().equals(AbstractView.class)
//                        && controller.getClass().getSuperclass().equals(AbstractController.class)) {
//                    if (views.containsKey(viewClassName) == false) {
//                        views.put(viewClassName, (AbstractView<?>) view);
//                        return true; // successfully registered view
//                    } else {
//                        logger.info("Trying to re-register already present view. Failed.");
//                        logger.debug("View: " + view.getClass().toString());
//                        logger.debug("Controller: " + controller.getClass().toString());
//                    }
//                } else {
//                    logger.error("Error occured while trying to register view. Unexpected results may occur");
//                }
//            } else {
//                logger.warn("The passed view class is not annotated with MVCView annotation");
//            }
//        } catch (Exception e) {
//            logger.error(e.getClass().toString());
////            logger.info();
//        }
//        return false;
//    }
}
