
package enterprise.builder;

import enterprise.builder.builderElements.*;

public class BuilderMain {

    /*
    Builder is a creational design pattern,
    which allows constructing complex objects' step by step.

    Builder — это порождающий шаблон проектирования,
    который позволяет шаг за шагом строить сложные объекты.
     */

    public static void main(String[] args) {

        BuildingCreator buildingCreator = new BuildingCreator();

        buildingCreator.setBuildingBuilder(new ResidentialBuilder());
        Building residentialBuilding = buildingCreator.createBuilding();
        System.out.println(residentialBuilding);

        buildingCreator.setBuildingBuilder(new CommercialBuilder());
        Building commercialBuilding = buildingCreator.createBuilding();
        System.out.println(commercialBuilding);

        buildingCreator.setBuildingBuilder(new PrivateBuilder());
        Building privateBuilding = buildingCreator.createBuilding();
        System.out.println(privateBuilding);
    }
}
