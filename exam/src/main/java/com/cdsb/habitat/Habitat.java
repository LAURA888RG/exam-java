package com.cdsb.habitat;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.Animals.Animal;
import com.cdsb.Enums.HabitatType;

public abstract class Habitat implements IHabitat {

    protected HabitatType habitatType;
    protected int totalSpace;
    protected List<Animal> animals;

    public Habitat(HabitatType habitatType, double totalSpace) {

        this.habitatType = habitatType;
        this.totalSpace = totalSpace;
        this.animals = new ArrayList<>();
    }

    @Override
    public HabitatType getType(){
        return habitatType;
    }

    @Override
    public double getSpaceNeeded(){
        return totalSpace;
    }

    @Override
    public List<Animal> getAnimals(){
        return animals;
    }

    @Override

    
    public abstract boolean isHabitatCompatible(Animal animal);
 

}
