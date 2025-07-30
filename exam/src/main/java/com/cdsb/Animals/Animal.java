package com.cdsb.Animals;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;

public abstract class Animal implements IAnimal{

    protected String name;
    protected String specie;
    protected String diet;
    protected HabitatType habitatType;
    protected TypeAnimal typeAnimal;

    public Animal (String name, String specie, String diet, HabitatType habitatType, TypeAnimal typeAnimal){
        this.name = name;
        this.specie = specie;
        this.diet = diet;
        this.habitatType = habitatType;
        this.typeAnimal = typeAnimal;

    }
    //add  getters
    public String getName() {
        return name;
    }
    public String getSpecie() {
        return specie;
    }
    public String getDiet(){
        return diet;
    }
    
    public HabitatType getHabitatType(){
        return habitatType;
    }
    public TypeAnimal getTypeAnimal(){
        return typeAnimal;

}

    public abstract boolean isCompatibleWith(Animal otherAnimal);


}
