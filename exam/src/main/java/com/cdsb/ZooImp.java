package com.cdsb;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoImpl implements IZoologico {

    private List<IHabitat> habitats;

    public ZoologicoImpl() {
        habitats = new ArrayList<>();
    }

    @Override
    public void addHabitat(IHabitat habitat) {
        habitats.add(habitat);
    }

    @Override
    public boolean assignAnimalToHabitat(IAnimal animal) {
        for (IHabitat habitat : habitats) {
            if (habitat.getType() == animal.getPreferredHabitat()) {
                if (habitat.addAnimal(animal)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void showStatus() {
        System.out.println("Estado Zoológico:");
        for (IHabitat habitat : habitats) {
            System.out.println("Hábitat: " + habitat.getType());
            habitat.showAnimals();
            System.out.println();
        }
    }
}