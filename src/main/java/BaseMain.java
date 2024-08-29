public class BaseMain {
    public static void main(String[] args){
        System.out.println("Main method execution starts");
        Student std1 = new Student();
        System.out.println("Student object created");
        //System.out.println(std1);
        System.out.println("Student name : " + std1.stdName); //Null
        System.out.println("Student ID : " + std1.stdId); //0
        System.out.println("Student section : " + std1.stdSection); //Null
        std1.stdName = "Suma";
        std1.stdId = 101;
        std1.stdSection = "B";
        System.out.println("Student name : " + std1.stdName); //Suma
        System.out.println("Student ID : " + std1.stdId); //101
        System.out.println("Student section : " + std1.stdSection); //B
    }
}
