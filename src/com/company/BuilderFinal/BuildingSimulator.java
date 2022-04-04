package com.company.BuilderFinal;

public class BuildingSimulator {

    public static void main(String[] args) {
        BuildingBuilder buildingBuilder = new BuildingBuilder();
        Building luxuryBuilding = buildingBuilder.buildLuxuryBuilding();
        Building normalBuilding = buildingBuilder.buildNormalBuilding();
        System.out.println("luxury building");
        luxuryBuilding.showDetails();
        System.out.println("\nnormal building");
        normalBuilding.showDetails();
    }

}
