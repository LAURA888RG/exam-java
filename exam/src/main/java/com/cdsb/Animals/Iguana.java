package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Iguana extends Animal {
    public Iguana (String name){
        
        super(name,"Iguana",DietType.HERVIBOROUS,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   
    }

    @Override
     public boolean isCompatible(Animal other)
    {
        return false;
    }

}
