package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Elephant extends Animal {
    public Elephant (String name){
        
        super(name,"Elephant",DietType.HERBIVOROUS,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }
}
