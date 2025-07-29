package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Seal extends Animal {
    public Seal (String name){
        
        super(name,"Seal","Carnivorous",2,200,false,true,HabitatType.AQUATIC, TypeAnimal.AQUATICS);   

    }

}
