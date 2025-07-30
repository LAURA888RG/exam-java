package com.cdsb;

import com.cdsb.animals.Animal;
import com.cdsb.animals.Cebra;
import com.cdsb.animals.Dolphin;
import com.cdsb.animals.Elephant;
import com.cdsb.animals.Iguana;
import com.cdsb.animals.Lion;
import com.cdsb.animals.Parrot;
import com.cdsb.animals.Seal;
import com.cdsb.animals.Snake;
import com.cdsb.animals.Toucan;
import com.cdsb.enums.HabitatType;
import com.cdsb.habitat.Aquatic;
import com.cdsb.habitat.Habitat;
import com.cdsb.habitat.Terrarium;
import com.cdsb.habitat.Terrestrial;
import com.cdsb.zoo.Zoo;

public class Main {

 
    public static void main(String[] args) {

        // create zoo
        Zoo zoo = new Zoo();

        // create habitats

        Habitat terrestrial = new Terrestrial();
        Habitat aquatic = new Aquatic();
        Habitat terrarium = new Terrarium();

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
