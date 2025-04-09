package logging;

/**
 * This class contains utility functions for creating and editing maps to be used in the game. It is also the entry point to be used from main to access the map editor.
 *
 */
public class LogEntryBuffer extends Observable {
    /**
     * The instance of the LogEntryBuffer
     */
    private static LogEntryBuffer instance = new LogEntryBuffer();

    /**
     * Make the constructor private so that this class cannot be instantiated
     */
    private LogEntryBuffer() {
    }

    /**
     * If the instance was not previously created, create it. Then return the instance
     * @return The instance of the LogEntryBuffer
     */
    public static LogEntryBuffer getInstance() {
        if (instance == null)
            instance = new LogEntryBuffer();
        return instance;
    }

    /**
     * takes logging message from the running project and calls notifyObservers for notifying every attached Observer.
     * @param p_logMessage The log message to be written
     */
    public void writeLog(String p_logMessage) {
        notifyObservers(p_logMessage);
    }

}