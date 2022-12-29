
package enterprise.decorator;

import enterprise.decorator.decoratorElements.Developer;
import enterprise.decorator.decoratorElements.JavaDeveloper;
import enterprise.decorator.decoratorElements.JavaTeamLead;
import enterprise.decorator.decoratorElements.SeniorJavaDeveloper;

public class DecoratorMain {

    /*
    Decorator is a structural pattern that allows adding new behaviors to objects dynamically
    by placing them inside special wrapper objects, called decorators.

    Декоратор — это структурный шаблон, который позволяет динамически добавлять новое поведение к объектам,
    помещая их внутрь специальных объектов-оболочек, называемых декораторами.
     */

    public static void main(String[] args) {

        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.developSoftware());
    }
}
