
package enterprise.iterator;

import enterprise.iterator.iteratorElements.Iterator;
import enterprise.iterator.iteratorElements.JavaDeveloper;
import java.util.ArrayList;
import java.util.List;

public class IteratorMain {

    /*
    Iterator is a behavioral design pattern that allows sequential traversal
    through a complex data structure without exposing its internal details.

    Итератор — это поведенческий шаблон проектирования, который позволяет
    последовательно проходить через сложную структуру данных, не раскрывая ее внутренние детали.
     */

    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();

        {
            skills.add("Java");
            skills.add("Spring");
            skills.add("Hibernate");
            skills.add("MySQL");
            skills.add("AWS");
        }

        JavaDeveloper javaDeveloper = new JavaDeveloper("Tom Hanks", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer - " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {

            System.out.println(iterator.next().toString() + " ");
        }
    }
}
