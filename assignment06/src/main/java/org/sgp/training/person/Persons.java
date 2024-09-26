package org.sgp.training.person;

public class Persons {
    private String personName;
    private int personAge;

    public Persons(String name, int age){
        personName=name;
        personAge=age;
    }

    public String getPersonName() {
        return personName;
    }
    public int getPersonAge() {
        return personAge;
    }

    public void displayPersonInfo(){
        System.out.println("Name of the person is "+personName);
        System.out.println(personName+"'s age is "+personAge);
    }
}
