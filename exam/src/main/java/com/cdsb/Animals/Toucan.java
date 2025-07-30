package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Toucan extends Animal {
    public Toucan (String name){
        
        super(name,"Toucan",DietType.OMNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }

}
