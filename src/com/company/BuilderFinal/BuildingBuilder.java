package com.company.BuilderFinal;

import java.util.ArrayList;
import java.util.List;

public class BuildingBuilder {

    public Building buildLuxuryBuilding(){
        Building luxuryBuilding = new Building();
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

    public Building buildNormalBuilding(){
        Building normalBuilding = new Building();
        normalBuilding.addMaterials(new Room(1));
        normalBuilding.addMaterials(new Room(2));
        normalBuilding.addMaterials(new Wall(1,2, "south"));
        normalBuilding.addMaterials(new Door(1,2));
        return normalBuilding;
    }

}
