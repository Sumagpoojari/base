package sgp.org.training;

public class Shapes {
    private int length;//height
    private int width;//base
    private String typeOfShape;

    //constructor for triangle and quadrilateral
    public Shapes(String shape, int height, int base){
        this.typeOfShape = shape;
        this.length = height;
        this.width = base;
    }
    //constructor for square and circle
    public Shapes(String shape, int value){
        this.typeOfShape = shape;
        this.width = value;
        this.length = value;
    }
    //default constructor
    public Shapes(String shape){
        this.typeOfShape = shape;
        this.length = 1;
        this.width = 1;
    }
    //private constructor
    //private Shapes(){
    //}

    public double areaOfTheShape(){
        System.out.println("-------Parent method-------");
        int square = typeOfShape.compareToIgnoreCase("square");
        int rectangle = typeOfShape.compareToIgnoreCase("rectangle");
        int triangle = typeOfShape.compareToIgnoreCase("triangle");
        int circle = typeOfShape.compareToIgnoreCase("circle");
        if(square == 0){
            return (double) width*width;//can be length*length
        }else if(rectangle == 0){
            return  (double) length*width;
        }else if(triangle == 0){
            return (double)(length*width)/2;
        }else if(circle == 0){
            return (double) 22/7*width*width;
        }else{
            System.out.println("Please enter valid shape");
            return 0.0;
        }
    }


}
