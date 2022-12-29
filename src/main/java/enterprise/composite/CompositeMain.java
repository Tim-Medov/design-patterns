
package enterprise.composite;

import enterprise.composite.compositeElements.Developer;
import enterprise.composite.compositeElements.JavaDeveloper;
import enterprise.composite.compositeElements.PythonDeveloper;
import enterprise.composite.compositeElements.Team;

public class CompositeMain {

    /*
    Composite is a structural design pattern that allows composing objects
    into a tree-like structure and work with it as if it was a singular object.

    Композит — это структурный шаблон проектирования, который позволяет объединять объекты
    в древовидную структуру и работать с ней, как если бы это был отдельный объект.
     */

    public static void main(String[] args) {

        Team team = new Team();

        Developer javaDeveloper = new JavaDeveloper();
        Developer pythonDeveloper = new PythonDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(pythonDeveloper);

        team.createProject();
    }
}
