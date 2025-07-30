package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Elephant extends Animal {
    public Elephant (String name){
        
        super(name,"Elephant",DietType.HERVIBOROUS,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }
}
