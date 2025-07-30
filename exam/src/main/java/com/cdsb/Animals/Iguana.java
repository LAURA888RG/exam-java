package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Iguana extends Animal {
    public Iguana (String name){
        
        super(name,"Iguana",DietType.HERBIVOROUS,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   
    }

}
