package com.cdsb;

import com.cdsb.Zoo.HabitatImp;

public interface IZoo {
    void addHabitat(HabitatImp habitat);
    boolean assignAnimalHabitat(Animal animal);
    void showStatus();
}
