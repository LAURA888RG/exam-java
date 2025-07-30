package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Enums.DietType;

public class Cebra extends Animal {
    public Cebra (String name){
        
        super(name,"Cebra", DietType.HERVIBOROUS, HabitatType.TERRESTRIAL, TypeAnimal.BIRDS);   

    }

}
