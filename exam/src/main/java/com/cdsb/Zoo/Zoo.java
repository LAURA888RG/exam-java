package com.cdsb.zoo;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.animals.Animal;
import com.cdsb.habitat.Habitat;

public class Zoo {

    private List<Habitat> habitats;

    public Zoo(){
        this.habitats = new ArrayList<>();
    }

    //add habitat zoo 
    public void addHabitat(Habitat habitat){
        if (habitat != null){
            habitats.add(habitat);
        }
    }

    //assign animal habitat
    public boolean assignAnimalToHabitat(Animal animal){
        for (Habitat habitat : habitats){
            if(habitat.isHabitatCompatible(animal)){
                return habitat.addAnimal(animal);
            }
        }
        return false;
    }

    //show status zoo
    public void showZooStatus(){
        System.out.println("Estado Zoologico");

        for(Habitat habitat : habitats){
            System.out.println("Habitat" + habitat.getType());
            List<Animal> animals = habitat.getAnimals();
            if (animals.isEmpty()) {
                System.out.println("Animal no asignado");
            }else {
                for (Animal animal : animals){
                    System.out.println("-" + animal.getName() + "(" + animal.getSpecie() + ")");
                }
            }

        }
    }
    

}
