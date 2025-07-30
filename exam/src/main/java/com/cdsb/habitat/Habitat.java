package com.cdsb.habitat;

import java.util.ArrayList;
import java.util.List;
import com.cdsb.animals.Animal;
import com.cdsb.enums.HabitatType;

public abstract class Habitat implements IHabitat {

    protected HabitatType habitatType;
    protected double totalSpace;
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


    public abstract boolean isHabitatCompatible(Animal animal);

    public boolean addAnimal(Animal animal){
        if(isHabitatCompatible(animal)) {
            animals.add(animal);
            return true;
        }
          return false;
}

}
