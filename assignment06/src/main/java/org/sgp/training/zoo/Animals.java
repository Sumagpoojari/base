package org.sgp.training.zoo;

public class Animals {
    private String animalName;
    private String animalSound;

    public Animals(String animal) {
        animalName = animal;
        animalSound = "Roar"; //default
    }
    public String getAnimalName() {
        return animalName;
    }
    public void sound(){
        System.out.println(animalName+"s "+animalSound);
    }

}
