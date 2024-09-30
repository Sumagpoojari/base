package sgp.org.training;

public class Trapezoid extends Shapes{
    private String shapeName;
    private int parallelSide1;
    private int parallelSide2;
    private int height;
    public Trapezoid(String shape, int len1,int len2, int ht){
        //super();
        super(shape);
        this.shapeName = shape;
        this.parallelSide1 = len1;
        this.parallelSide2 = len2;
        this.height = ht;
    }

    @Override
    public double areaOfTheShape() {
        int trapezoid = shapeName.compareToIgnoreCase("trapezoid");
        System.out.println("--------Child method----------");
        return (double)(parallelSide1+parallelSide2)*height/2;
    }
}
