package com.cdsb.habitat;

import java.util.List;

import com.cdsb.Animals.Animal;
import com.cdsb.Enums.HabitatType;

public interface IHabitat {

    HabitatType getType();
    boolean addAnimal(Animal animal);

 
}

