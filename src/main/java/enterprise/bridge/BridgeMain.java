
package enterprise.bridge;

import enterprise.bridge.bridgeElements.*;
import java.util.ArrayList;
import java.util.List;

public class BridgeMain {

    public static void main(String[] args) {

        /*
        Bridge is a structural design pattern that divides business logic or huge class
        into separate class hierarchies that can be developed independently.

        Мост — это структурный шаблон проектирования, который делит бизнес-логику или огромный класс
        на отдельные иерархии классов, которые можно разрабатывать независимо.
         */

        List<Program> programList = new ArrayList<>();

        {
            programList.add(new AutoCadProgram(new JavaDeveloper()));
            programList.add(new MayaProgram(new PythonDeveloper()));
        }

        programList.forEach(Program::developProgram);
    }
}
