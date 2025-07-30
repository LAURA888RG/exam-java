package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Snake extends Animal {
    public Snake (String name){
        
        super(name,"Snake",DietType.CARNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   

    }

}

