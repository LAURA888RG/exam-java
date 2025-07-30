package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Dolphin extends Animal {

    public Dolphin (String name){
        
        super(name,"Dolphin",DietType.CARNIVOROUS,HabitatType.AQUATIC, TypeAnimal.AQUATICS);   

    }

}
