package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Snake extends Animal {
    public Snake (String name){
        
        super(name,"Snake",DietType.CARNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   

    }
     @Override
    public boolean isCompatible(Animal other)
    {
        return false;
    }

}

