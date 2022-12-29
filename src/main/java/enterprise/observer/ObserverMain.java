
package enterprise.observer;

import enterprise.observer.observerElements.JavaDeveloperJobSite;
import enterprise.observer.observerElements.Observer;
import enterprise.observer.observerElements.Subscriber;

public class ObserverMain {

    /*
    Observer is a behavioral design pattern that allows some objects
    to notify other objects about changes in their state.

    Наблюдатель — это поведенческий шаблон проектирования, который позволяет
    некоторым объектам уведомлять другие объекты об изменениях в их состоянии.
     */

    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Tom Hanks");
        Observer secondSubscriber = new Subscriber("Bob Bush");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
