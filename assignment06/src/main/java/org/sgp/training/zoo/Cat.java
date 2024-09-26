package org.sgp.training.zoo;

public class Cat extends Animals{
    private String catSound ="Meow";
    public Cat(String animal) {
        super(animal);
    }

    @Override
    public void sound() {
        System.out.println(getAnimalName()+"s "+catSound);
    }
}
