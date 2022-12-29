
package enterprise.builder.builderElements;

public class Building {

    private BuildingType buildingType;
    private String address;
    private int price;

    public void setBuildingType(BuildingType buildingType) {

        this.buildingType = buildingType;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    @Override
    public String toString() {

        return "Building type: " + buildingType + " Address: " + address + " Price: " + price;
    }
}
