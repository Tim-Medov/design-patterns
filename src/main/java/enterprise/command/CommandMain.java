
package enterprise.command;

import enterprise.command.commandElements.*;

public class CommandMain {

    /*
    Command is behavioral design pattern that converts
    requests or simple operations into objects.

    Команда — это поведенческий шаблон проектирования,
    который преобразует запросы или простые операции в объекты.
     */

    public static void main(String[] args) {

        Database database = new Database();

        Developer developer = new Developer(

                new SelectCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        developer.selectRecord();
        developer.insertRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
