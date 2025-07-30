package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Seal extends Animal {
    public Seal (String name){
        
        super(name,"Seal",DietType.CARNIVOROUS,HabitatType.AQUATIC, TypeAnimal.AQUATICS);   

    }

}
