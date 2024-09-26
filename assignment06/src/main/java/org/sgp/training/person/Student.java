package org.sgp.training.person;

public class Student extends Persons {
    private String stdGrade;
    public Student(String name, int age, String grade) {
        super(name, age);
        stdGrade=grade;
    }

    public String getStdGrade() {
        return stdGrade;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("----------------------------------");
        super.displayPersonInfo();
        System.out.println(getPersonName()+" is a student with "+stdGrade+" grade.");
    }
}
