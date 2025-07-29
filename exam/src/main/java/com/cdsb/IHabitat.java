package com.cdsb;

import java.util.List;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Zoo.Animal;

public interface IHabitat {

    HabitatType getType();
    double getSpaceNeeded();
    List<Animal> getAnimals();
    boolean addAnimal(Animal animal);
    void showAnimals();
}

