
package enterprise.abstractFactory.abstractFactoryElements;

public interface TeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
