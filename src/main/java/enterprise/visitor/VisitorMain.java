
package enterprise.visitor;

import enterprise.visitor.visitorElements.Developer;
import enterprise.visitor.visitorElements.JuniorDeveloper;
import enterprise.visitor.visitorElements.Project;
import enterprise.visitor.visitorElements.SeniorDeveloper;

public class VisitorMain {

    /*
    Visitor is a behavioral design pattern that allows adding new behaviors
    to existing class hierarchy without altering any existing code.

    Посетитель — это поведенческий шаблон проектирования, который позволяет добавлять
    новые варианты поведения в существующую иерархию классов без изменения существующего кода.
     */

    public static void main(String[] args) {

        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(junior);
        System.out.println("------------------------------");

        System.out.println("Senior in action...");
        project.beWritten(senior);
        System.out.println("------------------------------");
    }
}
