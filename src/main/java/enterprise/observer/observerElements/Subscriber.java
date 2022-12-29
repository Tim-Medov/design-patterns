
package enterprise.observer.observerElements;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {

        this.name = name;
    }

    @Override
    public void handleEvents(List<String> vacancies) {

        System.out.println("Dear " + name + " we have some new vacancies for you:\n" + vacancies);
    }
}
