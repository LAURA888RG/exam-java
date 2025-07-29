package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Elephant extends Animal {
    public Elephant (String name){
        
        super(name,"Elephant","Herbivorous",18,1500,true,false,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }
}
