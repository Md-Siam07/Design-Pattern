package com.company.BuilderFinal;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Material> materials;

    public Building() {
        this.materials = new ArrayList();
    }

    public void addMaterials(Material material){
        this.materials.add(material);
    }

    public void showDetails(){
        for(Material material: materials){
            material.enter();
        }
    }

}
