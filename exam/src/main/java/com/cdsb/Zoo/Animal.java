package com.cdsb.Zoo;

import com.cdsb.Enums.HabitatType;
import com.cdsb.Enums.TypeAnimal;
import com.cdsb.Enums.Typeanimal;

public abstract class Animal {

    protected String name;
    protected String specie;
    protected String diet;
    protected int spaceNeeded;
    protected boolean social;
    protected boolean predator;
    protected HabitatType habitatType;
    protected TypeAnimal typeAnimal;

    public Animal (String name, String specie, int spaceNeeded, int feedingFrequency, boolean social, boolean predator, HabitatType habitatType, TypeAnimal typeAnimal){
        this.name = name;
        this.specie = specie;
        this.diet = diet;
        this.spaceNeeded = spaceNeeded;
        this.feedingFrequency = feedingFrequency;
        this.social = social;
        this.predator = predator;
        this.habitatType = habitatType;
        this.typeAnimal = typeAnimal;

    }

    public String getName() {
        return name;
    }
    public String getSpecie() {
        return specie;
    }
    public String getDiet(){
        return diet;
    }
    public int getSpaceNeeded(){
        return spaceNeeded;
    }
    public int getFeedingFrequency(){
        return feedingFrequency;
    }
    public boolean isSocial(){
        return social; 
    }
    public boolean isPredator(){
        return predator;
    }
    public HabitatType getHabitatType(){
        return habitatType;
    }
    public TypeAnimal getTypeAnimal(){
        return typeAnimal;

}
 @Override
    public boolean isCompatibleWith(IAnimals animals) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean needVeterinaryCare() {
        return needVeterinaryCare;
    }

}
