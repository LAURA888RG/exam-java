package com.cdsb.Zoo;

import com.cdsb.Animals.Animal;
import com.cdsb.Zoo.Zoo.HabitatImp;

public interface IZoo {
    void addHabitat(HabitatImp habitat);
    boolean assignAnimalHabitat(Animal animal);
    void showStatus();
}
