package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public class Cebra extends Animal {

    public Cebra (String name){
        
        super(name,"Cebra", DietType.HERBIVOROUS,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }

   

}
