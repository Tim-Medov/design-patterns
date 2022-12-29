
package enterprise.facade.facadeElements;

public class SprintTracker {

    private boolean activeSprint;

    public boolean isActiveSprint() {

        return activeSprint;
    }

    public void startSprint() {

        System.out.println("Sprint is active");

        activeSprint = true;
    }

    public void finishSprint() {

        System.out.println("Sprint is not active");

        activeSprint = false;
    }
}
