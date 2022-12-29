
package enterprise.state;

import enterprise.state.stateElements.Developer;
import enterprise.state.stateElements.Activity;
import enterprise.state.stateElements.Sleeping;

public class StateMain {

    /*
    State is a behavioral design pattern that allows an object
    to change the behavior when its internal state changes.

    Состояние — это поведенческий шаблон проектирования, который позволяет
    объекту изменять поведение при изменении его внутреннего состояния.
     */

    public static void main(String[] args) {

        Activity activity = new Sleeping();

        Developer developer = new Developer();
        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {

            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
