
package enterprise.facade;

import enterprise.facade.facadeElements.Workflow;

public class FacadeMain {

    /*
    Facade is a structural design pattern that provides a simplified interface
    to a library, a framework, or any other complex set of classes.

    Фасад — это структурный шаблон проектирования, предоставляющий упрощенный интерфейс
    для библиотеки, фреймворка или любого другого сложного набора классов.
     */

    public static void main(String[] args) {

        Workflow workflow = new Workflow();

        workflow.solveTasks();
    }
}
