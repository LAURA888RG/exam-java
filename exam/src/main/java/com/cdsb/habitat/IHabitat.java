package com.cdsb.habitat;

import java.util.List;

import com.cdsb.animals.Animal;
import com.cdsb.enums.HabitatType;

public interface IHabitat {

    HabitatType getType();
    boolean addAnimal(Animal animal);

    List<Animal> getAnimals();

    double getSpaceNeeded();
}

