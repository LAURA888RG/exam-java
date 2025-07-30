package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Toucan extends Animal {
    public Toucan (String name){
        
        super(name,"Toucan",DietType.OMNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }

}
