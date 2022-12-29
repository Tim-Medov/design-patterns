
package enterprise.facade.facadeElements;

public class Workflow {

    Job job = new Job();
    SprintTracker sprintTracker = new SprintTracker();
    Developer developer = new Developer();

    public void solveTasks() {

        job.doJob();
        sprintTracker.startSprint();
        developer.doJobBeforeDeadline(sprintTracker);
    }
}
