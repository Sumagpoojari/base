package org.sgp.training;

import org.sgp.training.person.Persons;
import org.sgp.training.person.Student;
import org.sgp.training.person.Teacher;
import org.sgp.training.zoo.Animals;
import org.sgp.training.zoo.Cat;
import org.sgp.training.zoo.Dog;
import org.sgp.training.zoo.Lion;

public class InheritancePolymorphismMain {
    public static void main(String [] args){

        //creating object of Persons class
        Persons person1 = new Persons("Isha",28);
        person1.displayPersonInfo();

        //creating object of Teacher class
        Teacher teacher1 = new Teacher("Asha",29,"Kannada");
        teacher1.displayPersonInfo();

        //creating object of Student class
        Student std1 = new Student("Keerthi",21,"A+");
        std1.displayPersonInfo();

        //creating object of Student class of type Persons
        Persons person2 = new Student("Shreya",18,"A");
        person2.displayPersonInfo();

        //zoo example
        Animals tiger = new Animals("Tiger");
        tiger.sound();

        Lion cub = new Lion("Lion");
        cub.sound();

        Cat kitten = new Cat("Cat");
        kitten.sound();

        Dog pup = new Dog("Dog");
        pup.sound();

        //Iterating over an array of Animals objects

        Animals[] animalList = new Animals[4];
        animalList[0] = new Animals("Cheetha");
        animalList[1] = new Lion("Lioness");
        animalList[2] = new Cat("Persian cat");
        animalList[3] = new Dog("Husky");
        for (Animals singleAnimal : animalList) {
            singleAnimal.sound();
        }


    }
}
