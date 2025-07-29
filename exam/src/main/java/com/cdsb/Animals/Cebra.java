package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Cebra extends Animal {
    public Cebra (String name){
        
        super(name,"Cebra","Herbivorous",3,40,true,true,HabitatType.TERRESTRIAL, TypeAnimal.BIRDS);   

    }

}
