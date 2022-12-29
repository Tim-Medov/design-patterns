
package enterprise.singleton;

import enterprise.singleton.singletonElements.PlanetEarth;

public class SingletonMain {

    /*
    Singleton is a creational design pattern,
    which ensures that only one object of its kind exists
    and provides a single point of access to it for any other code.

    Синглтон — это порождающий шаблон проектирования,
    который гарантирует, что существует только один объект в своем роде,
    и предоставляет единую точку доступа к нему для любого другого кода.
     */

    public static void main(String[] args) {

        PlanetEarth earthX = PlanetEarth.getPlanetEarth();
        PlanetEarth earthY = PlanetEarth.getPlanetEarth();
        PlanetEarth earthZ = PlanetEarth.getPlanetEarth();

        System.out.println("Hashcode of earthX is " + earthX.hashCode());
        System.out.println("Hashcode of earthY is " + earthY.hashCode());
        System.out.println("Hashcode of earthZ is " + earthZ.hashCode());

        if (earthX == earthY && earthY == earthZ) {

            System.out.println("Three objects point to the same memory location i.e, to the same object");

        } else {

            System.out.println("Three objects DO NOT point to the same memory location i.e, " +
                    "they are independent instances");
        }
    }
}
