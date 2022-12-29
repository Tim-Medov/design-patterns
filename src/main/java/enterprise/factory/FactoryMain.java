
package enterprise.factory;

import enterprise.factory.factoryElements.*;

public class FactoryMain {

    /*
    Factory is a creational design pattern which solves the problem of
    creating objects without specifying their concrete classes.

    Фабричный — это порождающий шаблон проектирования, который решает проблему
    создания объектов без указания их конкретных классов.
     */

    public static void main(String[] args) {

        DeveloperFactory developerFactory = CreateDeveloperBySpeciality.create(DeveloperSpecialty.JAVA);

        Developer javaDeveloper = developerFactory.createDeveloper();

        javaDeveloper.writeCode();
    }
}
