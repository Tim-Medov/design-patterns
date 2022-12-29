
package enterprise.observer.observerElements;

public interface ObserverManager {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
