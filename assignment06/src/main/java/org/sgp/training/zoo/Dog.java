package org.sgp.training.zoo;

public class Dog extends Animals{
    private String dogSound = "Bark";
    public Dog(String animal) {
        super(animal);
    }

    @Override
    public void sound() {
        System.out.println(getAnimalName()+"s "+dogSound);
    }

}
