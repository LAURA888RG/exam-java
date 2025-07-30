package com.cdsb.Animals;

import com.cdsb.Enums.DietType;
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public class Seal extends Animal {
    public Seal (String name){
        
        super(name,"Seal",DietType.CARNIVOROUS,HabitatType.AQUATIC, TypeAnimal.AQUATICS);   

    }

}
