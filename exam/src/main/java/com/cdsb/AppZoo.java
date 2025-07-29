package com.cdsb;

import com.cdsb.Enums;
import com.cdsb.Animal
import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Zoo.Animal;
import java.util;

public class Main {

    public static void main(String[] args) {

        // create zoo
        Zoo zoo = new zoo();

        // create habitats

        Habitat terrestrial = new Habitat(HabitatType.TERRESTRIAL);
        Habitat aquatic = new Habitat(HabitatType.AQUATIC);
        Habitat terrarium = new Habitat(HabitatType.TERRARIUM);

        // add habitats zoo
        zoo.addHabitat(terrestrial);
        zoo.addHabitat(aquatic);
        zoo.addHabitat(terrarium);

        //create animals
        Animal lion = new mammals("Lion","Carnivorous",1,600,true,true,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);
        Animal elephant = new mammals("Elephant","Herbivorous",18,1500,true,false,HabitatType.TERRESTRIAL, TypeAnimal.MAMMALS);
        Animal cebra = new mammals("Cebra","Herbivorous",3,40,true,true,HabitatType.TERRESTRIAL, TypeAnimal.BIRDS);
        Animal dolphin = new aquatic("Dolphin","Carnivorous",5,13,true,true,HabitatType.AQUATIC, TypeAnimal.AQUATIC);
        Animal seal = new aquatic("Seal","Carnivorous",2,200,false,true,HabitatType.AQUATIC, TypeAnimal.AQUATICS);
        Animal parrot = new birds("Parrot","Omnivores",3,40,true,true,HabitatType.TERRARIUM, TypeAnimal.BIRDS);
        Animal toucan = new birds("Toucan","Omnivores",3,70,true,true,HabitatType.TERRARIUM, TypeAnimal.BIRDS);
        Animal snake = new reptiles("Snake","Carnivorous",1,200,false,true,HabitatType.TERRARIUM, TypeAnimal.REPTILES);
        Animal iguana = new reptiles("Iguana","Herbivorous",2,110,false,false,HabitatType.TERRARIUM, TypeAnimal.REPTILES);

        //Asign animals habitat
        zoo.assignAnimalToHabitat(lion);
        zoo.assignAnimalToHabitat(elephant);
        zoo.assignAnimalToHabitat(cebra);
        zoo.assignAnimalToHabitat(dolphin);
        zoo.assignAnimalToHabitat(seal);
        zoo.assignAnimalToHabitat(parrot);
        zoo.assignAnimalToHabitat(toucan);
        zoo.assignAnimalToHabitat(snake);
        zoo.assignAnimalToHabitat(iguana);

        //show zoo
        zoo.showZooStatus();

    }

}
