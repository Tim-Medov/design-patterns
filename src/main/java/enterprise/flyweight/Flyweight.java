
package enterprise.flyweight;

import enterprise.flyweight.flyweightElements.Developer;
import enterprise.flyweight.flyweightElements.DeveloperFactory;
import java.util.ArrayList;
import java.util.List;

public class Flyweight {

    /*
    Flyweight is a structural design pattern that allows programs to support
    vast quantities of objects by keeping their memory consumption low.

    Приспособленец — это структурный шаблон проектирования, который позволяет программам
    поддерживать огромное количество объектов, сохраняя при этом низкое потребление памяти.
     */

    public static void main(String[] args) {

        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));

        for (Developer developer : developers) {

            developer.writeCode();
        }
    }
}
