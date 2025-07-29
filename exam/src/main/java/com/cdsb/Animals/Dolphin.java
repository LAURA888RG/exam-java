package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Dolphin extends Animal {

    public Dolphin (String name){
        
        super(name,"Dolphin","Carnivorous",5,13,true,true,HabitatType.AQUATIC, TypeAnimal.AQUATIC);   

    }

}
