
package enterprise.abstractFactory;

import enterprise.abstractFactory.abstractFactoryElements.CompanyTeamFactory;
import enterprise.abstractFactory.abstractFactoryElements.Developer;
import enterprise.abstractFactory.abstractFactoryElements.ProjectManager;
import enterprise.abstractFactory.abstractFactoryElements.Tester;

public class AbstractFactoryMain {

    /*
    Abstract Factory is a creational design pattern, which solves the problem
    of creating entire product families without specifying their concrete classes.

    Абстрактная фабрика — это порождающий шаблон проектирования, который решает проблему
    создания целых семейств продуктов без указания их конкретных классов.
     */

    public static void main(String[] args) {

        CompanyTeamFactory companyTeamFactory = new CompanyTeamFactory();

        Developer developer = companyTeamFactory.getDeveloper();
        Tester tester = companyTeamFactory.getTester();
        ProjectManager projectManager = companyTeamFactory.getProjectManager();

        System.out.println("Company start working:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
