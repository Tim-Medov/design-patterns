
package enterprise.builder.builderElements;

public class PrivateBuilder extends BuildingBuilder {

    @Override
    protected void setBuildingType() {

        building.setBuildingType(BuildingType.PRIVATE);
    }

    @Override
    protected void setAddress() {

        building.setAddress("2 Meeker St, Staten Island, NY 10306");
    }

    @Override
    protected void setPrice() {

        building.setPrice(1_000_000);
    }
}
