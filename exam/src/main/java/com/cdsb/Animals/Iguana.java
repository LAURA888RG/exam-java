package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;

public class Iguana extends Animal {
    public Iguana (String name){
        
        super(name,"Iguana","Herbivorous",2,110,false,false,HabitatType.TERRARIUM, TypeAnimal.REPTILES);   

    }

}
