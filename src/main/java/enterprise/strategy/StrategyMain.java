
package enterprise.strategy;

import enterprise.strategy.strategyElements.*;

public class StrategyMain {

    /*
    Strategy is a behavioral design pattern that turns a set of behaviors into objects
    and makes them interchangeable inside original context object.

    Стратегия — это поведенческий шаблон проектирования, который превращает набор поведений
    в объекты и делает их взаимозаменяемыми внутри исходного объекта контекста.
     */

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
