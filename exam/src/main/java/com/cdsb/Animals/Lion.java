package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Lion extends Animal {
    public Lion (String name){
        
        super(name,"Lion",DietType.CARNIVOROUS,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }
    @Override
    public boolean isCompatible(Animal other)
    {
        return false;
    }

}
