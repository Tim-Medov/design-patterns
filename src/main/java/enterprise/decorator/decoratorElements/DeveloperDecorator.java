
package enterprise.decorator.decoratorElements;

public class DeveloperDecorator implements Developer {

    private Developer developer;

    public DeveloperDecorator(Developer developer) {

        this.developer = developer;
    }

    @Override
    public String developSoftware() {

        return developer.developSoftware();
    }
}
