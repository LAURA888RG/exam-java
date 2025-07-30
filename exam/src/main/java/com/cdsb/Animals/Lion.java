package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Lion extends Animal {
    public Lion (String name){
        
        super(name,"Lion",DietType.CARNIVOROUS,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }
   

}
