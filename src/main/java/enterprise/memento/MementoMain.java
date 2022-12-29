
package enterprise.memento;

import enterprise.memento.mementoElements.GitHubRepository;
import enterprise.memento.mementoElements.Project;

public class MementoMain {

    /*
    Memento is a behavioral design pattern that allows making
    snapshots of an object’s state and restoring it in the future.

    Memento — это поведенческий паттерн проектирования, который позволяет
    делать снимки состояния объекта и восстанавливать его в будущем.
     */

    public static void main(String[] args) {

        Project project = new Project();
        GitHubRepository gitHubRepository = new GitHubRepository();

        System.out.println("Creating new project version: 1.0");
        project.setVersion("1.0");
        System.out.println(project);

        System.out.println("Saving current version to GitHub...");
        gitHubRepository.setSave(project.save());

        System.out.println("Updating project to version: 1.1");
        project.setVersion("1.1");
        System.out.println(project);

        System.out.println("Rolling back to version 1.0");
        project.load(gitHubRepository.getSave());

        System.out.println("Project after rollback: ");
        System.out.println(project);
    }
}
