
package enterprise.factory.factoryElements;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {

        return new JavaDeveloper();
    }
}
