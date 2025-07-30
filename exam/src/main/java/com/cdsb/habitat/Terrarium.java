package com.cdsb.habitat;

import com.cdsb.animals.Animal;
import com.cdsb.enums.HabitatType;

public class Terrarium extends Habitat {

    public Terrarium(){
        super(HabitatType.TERRARIUM, 800);
    }

    @Override
    public boolean isHabitatCompatible (Animal animal){
        return animal.getHabitat() == HabitatType.TERRARIUM;
    }

}
