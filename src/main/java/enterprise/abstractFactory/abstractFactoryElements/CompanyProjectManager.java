
package enterprise.abstractFactory.abstractFactoryElements;

public class CompanyProjectManager implements ProjectManager {

    @Override
    public void manageProject() {

        System.out.println("Project Manager manages company's project...");
    }
}
