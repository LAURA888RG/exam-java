package com.cdsb;

import com.cdsb.Animals.Animal;
import com.cdsb.Animals.Cebra;
import com.cdsb.Animals.Dolphin;
import com.cdsb.Animals.Elephant;
import com.cdsb.Animals.Iguana;
import com.cdsb.Animals.Lion;
import com.cdsb.Animals.Parrot;
import com.cdsb.Animals.Seal;
import com.cdsb.Animals.Snake;
import com.cdsb.Animals.Toucan;
import com.cdsb.Zoo.Zoo;
import com.cdsb.habitat.Habitat;

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
        Animal lion = new Lion("Lion");
        Animal elephant = new Elephant("Elephant");
        Animal cebra = new Cebra("Cebra");
        Animal dolphin = new Dolphin("Dolphin");
        Animal seal = new Seal("Seal");
        Animal parrot = new Parrot("Parrot");
        Animal toucan = new Toucan("Toucan");
        Animal snake = new Snake("Snake");
        Animal iguana = new Iguana("Iguana");

        //Asign animals habitat
        boolean addLeon = zoo.assignAnimalToHabitat(lion);
        System.out.println(addLeon);
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
