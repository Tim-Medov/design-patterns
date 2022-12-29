
package enterprise.prototype.prototypeElements;

public class Gun implements Copyable {

    private long id;
    private String gunName;

    public Gun(String gunName) {

        this.id = this.hashCode();
        this.gunName = gunName;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getGunName() {

        return gunName;
    }

    public void setGunName(String gunName) {

        this.gunName = gunName;
    }

    @Override
    public Object copy() {

        return new Gun(gunName);
    }

    @Override
    public String toString() {

        return "Gun ID : " + id + " Gun name: " + gunName;
    }
}
