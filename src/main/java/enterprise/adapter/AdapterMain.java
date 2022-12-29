
package enterprise.adapter;

import enterprise.adapter.adapterElements.AdapterProgramToDatabase;
import enterprise.adapter.adapterElements.Database;

public class AdapterMain {

    /*
    Adapter is a structural design pattern,
    which allows incompatible objects to collaborate.

    Адаптер — это структурный шаблон проектирования,
    который позволяет несовместимым объектам взаимодействовать.
     */

    public static void main(String[] args) {

        Database database = new AdapterProgramToDatabase();

        database.select();
        database.insert();
        database.update();
        database.remove();
    }
}
