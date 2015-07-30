package org.gnuport.gnufinance.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gnuport.gnufinance.modules.transaction.events.NewTransactionEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Suresh Sarda
 *
 */

public class EventBus {

    Logger logger = LoggerFactory.getLogger(EventBus.class);

    Map<String, List<EventBusListener>> subscribers;

    public EventBus() {
        subscribers = new HashMap<String, List<EventBusListener>>();
    }

    public void publish(Object sender, Event event) {
        if (subscribers.containsKey(event.getClass().getName())) {
            for (EventBusListener listner : subscribers.get(event.getClass().getName())) {
                Method method = null;
                String methodName = null;
                try {
                    methodName = getMethodName(event);
                    method = listner.getClass().getMethod(methodName, sender.getClass(), event.getClass());
                    method.invoke(listner, sender, event);
                } catch (NoSuchMethodException | InvocationTargetException | SecurityException | IllegalAccessException e) {
                    logger.info("Exception while calling method of subscriber");
                    logger.debug(e.getClass().getSimpleName());
                    logger.debug("Method Name generated:" + methodName);
                    logger.debug("Method:" + method);
                    logger.debug("Object:" + listner);
                }
            }
        }
    }

    public <T> void subscribe(EventBusListener listner, Class<T> c) {
        String className = c.getName();
        if (subscribers.containsKey(className)) {
            subscribers.get(className).add(listner);
        } else {
            List<EventBusListener> list = new ArrayList<EventBusListener>();
            list.add(listner);
            subscribers.put(className, list);
        }
    }

    public <T> void unsuscribe(EventBusListener listner, Class<T> c) {
        String className = c.getName();
        if (subscribers.containsKey(className)) {
            subscribers.get(className).remove(listner);
        }
    }

    private String getMethodName(Event e) {
        String methodName = "on" + e.getClass().getSimpleName();
        return methodName;
    }

}
