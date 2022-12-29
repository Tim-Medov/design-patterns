
package enterprise.abstractFactory.abstractFactoryElements;

public class CompanyTeamFactory implements TeamFactory {

    @Override
    public Developer getDeveloper() {

        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {

        return new QaTester();
    }

    @Override
    public ProjectManager getProjectManager() {

        return new CompanyProjectManager();
    }
}
