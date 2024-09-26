package org.sgp.training.person;

public class Teacher extends Persons {
    private String teacherSubject;

    public Teacher(String name, int age, String sub) {
        super(name, age);
        teacherSubject=sub;
    }
    public String getTeacherSubject() {
        return teacherSubject;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("-----------------------------------");
        super.displayPersonInfo();
        System.out.println(getPersonName()+" is a teacher of "+teacherSubject+" subject.");
    }
}
