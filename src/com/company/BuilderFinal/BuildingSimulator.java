package com.company.BuilderFinal;

public class BuildingSimulator {

    public static void main(String[] args) {
        BuildingBuilder luxuryBuilder = new LuxuryBuldingBuilder();
        Building luxuryBuilding = luxuryBuilder.build();
        BuildingBuilder normalBuilder = new LuxuryBuldingBuilder();
        Building normalBuilding = normalBuilder.build();
        System.out.println("....luxury building....");
        luxuryBuilding.showDetails();
        System.out.println("\n....normal building....");
        normalBuilding.showDetails();
    }

}
