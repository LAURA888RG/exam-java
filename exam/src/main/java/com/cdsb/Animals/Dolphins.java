package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Dolphins extends Animal {

    public Dolphins (String name){
        
        super(name,"Dolphin","Aquatics","Carnivorous","Aquatic",5,"True","True",HabitatType.AQUATIC, TypeAnimal.AQUATICS);   

    }

}
