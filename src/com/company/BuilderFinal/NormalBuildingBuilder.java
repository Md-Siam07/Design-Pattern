package com.company.BuilderFinal;

public class NormalBuildingBuilder implements BuildingBuilder{
    Building normalBuilding = new Building();
    @Override
    public Building build() {
        normalBuilding.addMaterials(new Room(1));
        normalBuilding.addMaterials(new Room(2));
        normalBuilding.addMaterials(new Wall(1,2, "south"));
        normalBuilding.addMaterials(new Door(1,2));
        return normalBuilding;
    }
}
