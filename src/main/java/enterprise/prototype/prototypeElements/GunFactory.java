
package enterprise.prototype.prototypeElements;

public class GunFactory {

    private Gun gun;

    public GunFactory(Gun gun) {

        this.gun = gun;
    }

    public Gun cloneGun() {

        return (Gun) gun.copy();
    }
}
