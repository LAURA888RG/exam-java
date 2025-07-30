package com.cdsb.habitat;

import com.cdsb.animals.Animal;
import com.cdsb.enums.HabitatType;

public class Aquatic extends Habitat{

    public Aquatic(){
        super(HabitatType.AQUATIC, 20000);
    }

    @Override
    public boolean isHabitatCompatible(Animal animal){
       return animal.getHabitat() == HabitatType.AQUATIC;
    }

}
