
package enterprise.command.commandElements;

public class Developer {

    private Command select;
    private Command insert;
    private Command update;
    private Command delete;

    public Developer(Command select, Command insert, Command update, Command delete) {

        this.select = select;
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    public void selectRecord() {

        select.execute();
    }

    public void insertRecord() {

        insert.execute();
    }

    public void updateRecord() {

        update.execute();
    }

    public void deleteRecord() {

        delete.execute();
    }
}
