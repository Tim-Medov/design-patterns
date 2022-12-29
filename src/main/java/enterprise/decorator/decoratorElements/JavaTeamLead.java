
package enterprise.decorator.decoratorElements;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {

        super(developer);
    }

    public String sendWeekReport() {

        return " Send week report to customer";
    }

    @Override
    public String developSoftware() {

        return super.developSoftware() + sendWeekReport();
    }
}
