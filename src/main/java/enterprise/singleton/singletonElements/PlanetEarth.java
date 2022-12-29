
package enterprise.singleton.singletonElements;

public class PlanetEarth {

    private static PlanetEarth planetEarth = null;
    private String planetName;

    private PlanetEarth() {

        planetName = "Earth";
    }

    public static PlanetEarth getPlanetEarth() {

        if (planetEarth == null) {

            planetEarth = new PlanetEarth();
        }

        return planetEarth;
    }
}
