
package enterprise.bridge.bridgeElements;

public class AutoCadProgram extends Program {

    public AutoCadProgram(Developer developer) {

        super(developer);
    }

    @Override
    public void developProgram() {

        System.out.println("AutoCad development in progress...");
        developer.writeCode();
    }
}
