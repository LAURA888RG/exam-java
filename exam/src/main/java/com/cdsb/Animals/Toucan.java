package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Toucan extends Animal {
    public Toucan (String name){
        
        super(name,"Toucan","Omnivores",3,70,true,true,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }

}
