
package enterprise.builder.builderElements;

public class BuildingCreator {

    private BuildingBuilder buildingBuilder;

    public void setBuildingBuilder(BuildingBuilder buildingBuilder) {

        this.buildingBuilder = buildingBuilder;
    }

    public Building createBuilding() {

        buildingBuilder.setBuildingType();
        buildingBuilder.setAddress();
        buildingBuilder.setPrice();

        Building building = buildingBuilder.getBuilding();

        return building;
    }
}
