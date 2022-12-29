
package enterprise.adapter.adapterElements;

public class AdapterProgramToDatabase extends Program implements Database {

    @Override
    public void select() {

        getObject();
    }

    @Override
    public void insert() {

        createObject();
    }

    @Override
    public void update() {

        replaceObject();
    }

    @Override
    public void remove() {

        deleteObject();
    }
}
