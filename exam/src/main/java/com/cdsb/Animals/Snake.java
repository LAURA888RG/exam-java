package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Snake extends Animal {
    public Snake (String name){
        
        super(name,"Snake","Carnivorous",1,200,false,true,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   

    }
     @Override
    public boolean isCompatible(Animal other)
    {
        return false;
    }

}

