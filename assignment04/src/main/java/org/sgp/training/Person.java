package org.sgp.training;

public class Person {
    private String name;
    private int age;
    private String gender;

/*  Implement a constructor to initialize all these attributes
    Implement getters for all attributes(name, age, gender)
    Implement setters for only age
    Add a method displayInfo() that prints out the person details in a readable format */

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public void setAge(){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Person name is "+name);
        System.out.println("Person age is "+age);
        System.out.println("Person gender is "+gender);
    }

/*  Enhance your Person class to support constructor overloading
    Requirements:
    Add additional constructor that takes name and age, with a default gender value ("NA") */
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.gender = "NA";
    }

}
