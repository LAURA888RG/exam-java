package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Parrot extends Animal {
     public Parrot (String name){
        
        super(name,"Parrot",DietType.OMNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }


}
