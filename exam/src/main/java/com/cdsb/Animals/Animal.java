package com.cdsb.animals;

import com.cdsb.enums.DietType;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.TypeAnimal;

public abstract class Animal implements IAnimal{

    protected String name;
    protected String specie;
    protected DietType diet;
    protected HabitatType habitatType;
    protected TypeAnimal typeAnimal;

    public Animal (String name, String specie, DietType diet,HabitatType habitatType, TypeAnimal typeAnimal){
        this.name = name;
        this.specie = specie;
        this.diet = diet;
        this.habitatType = habitatType;
        this.typeAnimal = typeAnimal;

    }
   
    public String getName() {
        return this.name;
    }
    public String getSpecie() {
        return this.specie;
    }
    public DietType getDiet(){
        return this.diet;
    }
    
    public HabitatType getHabitat(){
        return this.habitatType;
    }
    public TypeAnimal getTypeAnimal(){
        return this.typeAnimal;

}

    public  boolean isCompatibleWith(Animal other){
         if (other == null) return false;

         return this.habitatType == other.getHabitat();

    }

    public boolean isCompatible()
    {
        return false;
    }

    

}
