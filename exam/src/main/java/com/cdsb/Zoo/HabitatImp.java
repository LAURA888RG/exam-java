package com.cdsb;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Zoo.IAnimal;

public class HabitatImpl implements IHabitat {

    private HabitatType type;
    private double size;
    private List<IAnimal> animals;

    public HabitatImpl(HabitatType type, double size) {
        this.type = type;
        this.size = size;
        this.animals = new ArrayList<>();
    }

    @Override
    public HabitatType getType() {
        return type;
    }

    @Override
    public double getSpaceNeeded() {
        return size;
    }

    @Override
    public List<IAnimal> getAnimals() {
        return animals;
    }

    @Override
    public boolean addAnimal(IAnimal animal) {
        // Calcular espacio usado
        double usedSpace = 0;
        for (IAnimal a : animals) {
            usedSpace += a.getSpaceNeeded();
        }
        if (usedSpace + animal.getSpaceNeeded() > size) {
            return false; // No hay espacio suficiente
        }

        // Verificar compatibilidad con animales existentes
        for (IAnimal a : animals) {
            if (!a.isCompatibleWith(animal) || !animal.isCompatibleWith(a)) {
                return false;
            }
        }

        // Verificar sociabilidad: si animal no sociable y ya hay animales, no puede añadirse
        if (!animal.isSociable() && !animals.isEmpty()) {
            return false;
        }

        animals.add(animal);
        return true;
    }

    @Override
    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No hay animales.");
        } else {
            for (IAnimal a : animals) {
                System.out.println(" - " + a.getName() + " (" + a.getSpecies() + ")");
            }
        }
    }
}