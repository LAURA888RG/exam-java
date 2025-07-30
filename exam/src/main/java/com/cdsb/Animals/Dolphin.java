package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Dolphin extends Animal {

    public Dolphin (String name){
        
        super(name,"Dolphin",DietType.CARNIVOROUS,HabitatType.AQUATIC, TypeAnimal.AQUATIC);   

    }

}
