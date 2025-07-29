package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Lion extends Animal {
    public Lion (String name){
        
        super(name,"Lion","Carnivorous",1,600,true,true,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);   

    }

}
