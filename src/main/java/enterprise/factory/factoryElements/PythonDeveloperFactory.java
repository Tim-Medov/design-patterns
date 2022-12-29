
package enterprise.factory.factoryElements;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {

        return new PythonDeveloper();
    }
}
