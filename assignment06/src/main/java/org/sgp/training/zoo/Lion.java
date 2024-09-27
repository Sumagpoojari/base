package org.sgp.training.zoo;

public class Lion extends Animals{
    public Lion(String animal) {
        super(animal);
    }

    @Override
    public void sound() {
        System.out.println(getAnimalName()+"s "+"Roar");
    }
}
