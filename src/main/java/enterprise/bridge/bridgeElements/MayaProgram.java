
package enterprise.bridge.bridgeElements;

public class MayaProgram extends Program {

    public MayaProgram(Developer developer) {

        super(developer);
    }

    @Override
    public void developProgram() {

        System.out.println("Maya development in progress...");
        developer.writeCode();
    }
}
