
package enterprise.builder.builderElements;

public class ResidentialBuilder extends BuildingBuilder {

    @Override
    public void setBuildingType() {

        building.setBuildingType(BuildingType.RESIDENTIAL);
    }

    @Override
    public void setAddress() {

        building.setAddress("30 Front St, Brooklyn, NY 11201");
    }

    @Override
    public void setPrice() {

        building.setPrice(100_000_000);
    }
}
