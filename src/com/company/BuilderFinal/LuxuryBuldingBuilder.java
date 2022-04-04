package com.company.BuilderFinal;

public class LuxuryBuldingBuilder implements BuildingBuilder{
    Building luxuryBuilding = new Building();
    @Override
    public Building build() {

        luxuryBuilding.addMaterials(new Room(1));
        luxuryBuilding.addMaterials(new Room(2));
        luxuryBuilding.addMaterials(new Room(3));
        luxuryBuilding.addMaterials(new Wall(1,2, "south"));
        luxuryBuilding.addMaterials(new Wall(2, 3, "north"));
        luxuryBuilding.addMaterials(new Wall(1,3,"east"));
        luxuryBuilding.addMaterials(new Door(2,3));
        luxuryBuilding.addMaterials(new Door(1,3));
        return luxuryBuilding;
    }
}
