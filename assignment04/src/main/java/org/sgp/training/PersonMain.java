package org.sgp.training;

public class PersonMain {
    public static void main(String [] args){
        //#01
        Person p1 = new Person("Geetha",28,"Female");
        p1.getName();
        p1.getAge();
        p1.getGender();
        p1.displayInfo();

        //#02
        Person p2 = new Person("Arul",30);
        p2.getName();
        p2.getAge();
        p2.getGender();
        p2.displayInfo();
    }
}
