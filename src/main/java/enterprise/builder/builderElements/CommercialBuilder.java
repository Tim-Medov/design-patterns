
package enterprise.builder.builderElements;

public class CommercialBuilder extends BuildingBuilder {

    @Override
    protected void setBuildingType() {

        building.setBuildingType(BuildingType.COMMERCIAL);
    }

    @Override
    protected void setAddress() {

        building.setAddress("117 West St, New York, NY 10006");
    }

    @Override
    protected void setPrice() {

        building.setPrice(500_000_000);
    }
}
