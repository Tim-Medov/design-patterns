
package enterprise.builder.builderElements;

public abstract class BuildingBuilder {

    protected Building building;

    protected BuildingBuilder() {

        building = new Building();
    }

    protected abstract void setBuildingType();

    protected abstract void setAddress();

    protected abstract void setPrice();

    protected Building getBuilding() {

        return building;
    }
}
