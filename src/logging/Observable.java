package logging;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements the connection/disconnection mechanism between
 * observers and observables (subject). It also implements the notification
 * mechanism that the observable will trigger when its state changes.
 *
 */
public class Observable {
    /**
     * The List of observers
     */
    private final List<Observer> observers = new ArrayList<Observer>();

    /**
     * attach a view to the model.
     *
     * @param p_o: view to be added to the list of observers to be notified.
     */
    public void attach(Observer p_o) {
        this.observers.add(p_o);
    }

    /**
     * detach a view from the model.
     *
     * @param p_o: view to be removed from the list of observers.
     */
    public void detach(Observer p_o) {
        if (!observers.isEmpty()) {
            observers.remove(p_o);
        }
    }

    /**
     * Notify all the views attached to the model.
     *
     * @param p_logString: string that contains the information to be observed.
     */
    public void notifyObservers(String p_logString) {
        for (Observer l_observer : observers) {
            l_observer.update(p_logString);
        }
    }

}