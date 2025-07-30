package com.cdsb.habitat;

import com.cdsb.animals.Animal;
import com.cdsb.enums.HabitatType;

public class Terrestrial extends Habitat {

      public Terrestrial(){
        super(HabitatType.TERRESTRIAL, 100);
      }
     @Override
     public boolean isHabitatCompatible(Animal animal) {
        return animal.getHabitat() == HabitatType.TERRESTRIAL;
     }
}
