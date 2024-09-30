package sgp.org.training;

public class ConstructorOverloadingMain {
    public static void main(String [] args){
        Shapes square = new Shapes("sqUare");
        System.out.println(square.areaOfTheShape()+" sq units");

        Shapes square2 = new Shapes("squar");
        System.out.println(square2.areaOfTheShape()+" sq units");

        Shapes rectangle = new Shapes("rectangle",5,6);
        System.out.println(rectangle.areaOfTheShape()+" sq units");

        Trapezoid trapezoid = new Trapezoid("trapezoid",2,2,2);
        System.out.println(trapezoid.areaOfTheShape()+" sq units");

        Shapes trapezoid1 = new Trapezoid("trapezoid",4,9,9);
        System.out.println(trapezoid1.areaOfTheShape()+" sq units");

    }
}
