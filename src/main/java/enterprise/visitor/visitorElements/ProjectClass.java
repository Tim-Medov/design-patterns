
package enterprise.visitor.visitorElements;

public class ProjectClass implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {

        developer.create(this);
    }
}
