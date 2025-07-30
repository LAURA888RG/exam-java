package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public interface IAnimal {

    String getName();
    String getSpecie();
    TypeAnimal getTypeAnimal();
    HabitatType getHabitat();
    DietType getDiet();
    //boolean isSocial();
    //double getSpaceNeeded();
    boolean isCompatibleWith(Animal other);

}

