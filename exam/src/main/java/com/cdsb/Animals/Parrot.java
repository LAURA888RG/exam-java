package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Parrot extends Animal {
     public Parrot (String name){
        
        super(name,"Parrot","Omnivores",3,40,true,true,HabitatType.TERRARIUM, TypeAnimal.BIRDS);   

    }


}
