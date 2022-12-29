
package enterprise.facade.facadeElements;

public class Developer {

    public void doJobBeforeDeadline(SprintTracker sprintTracker) {

        if (sprintTracker.isActiveSprint()) {

            System.out.println("Developer is solving tasks...");

        } else {

            System.out.println("Developer reads the documentation...");
        }
    }
}
