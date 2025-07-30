package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Parrot extends Animal {
     public Parrot (String name){
        
        super(name,"Parrot",DietType.OMNIVOROUS,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }


}
