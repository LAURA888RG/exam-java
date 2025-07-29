package com.cdsb.Zoo;

import java.util.ArrayList;

import com.cdsb.Enums.HabitatType;

public class Habitat {

    private HabitatType habitatType;
    private int totalSpace;
    private int usedSpace;
    private List<Animal> animals;

    public Habitat(HabitatType habitatType, int totalSpace) {
        this.habitatType = habitatType;
        this.totalSpace = totalSpace;
        this.usedSpace = 0;
        this.animals = new ArrayList<>();
    }

    public boolean addAnimal(Animal animal){
        if(animal.getHabitatType() !=this.habitatType) {
            System.out.println("No se agrega" + animal.getName() + "Habitat incompatible");
            return false;
        }

        if(usedSpace + animal.getSpaceNeeded() > totalSpace){
            System.out.println("Espacio no suficiente ");
        }
    
    }

}
