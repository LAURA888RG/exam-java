package com.cdsb;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public interface IAnimal {

    String getName();
    String getSpecie();
    TypeAnimal getTypeAnimal();
    HabitatType getHabitat();
    DietType getDiet();
    boolean isSocial();
    double getSpaceNeeded();
    boolean isCompatibleWith(Animal other);

}

