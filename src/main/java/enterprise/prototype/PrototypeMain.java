
package enterprise.prototype;

import enterprise.prototype.prototypeElements.Gun;
import enterprise.prototype.prototypeElements.GunFactory;

public class PrototypeMain {

    /*
    Prototype is a creational design pattern that allows cloning objects,
    even complex ones, without coupling to their specific classes.

    Прототип — это порождающий шаблон проектирования, который позволяет клонировать объекты,
    даже сложные, без привязки к их конкретным классам.
     */

    public static void main(String[] args) {

        GunFactory gunFactory = new GunFactory(new Gun("AK47"));

        Gun ak47Clone1 = gunFactory.cloneGun();
        Gun ak47Clone2 = gunFactory.cloneGun();
        Gun ak47Clone3 = gunFactory.cloneGun();

        System.out.println(ak47Clone1);
        System.out.println(ak47Clone2);
        System.out.println(ak47Clone3);
    }
}
