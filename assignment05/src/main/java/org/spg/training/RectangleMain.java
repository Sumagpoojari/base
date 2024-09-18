package org.spg.training;

public class RectangleMain {
    public static void main(String [] args){

        //regular rectangle
        Rectangle rec = new Rectangle(4,8);
        double myLen = rec.getRecLength();
        double myWid = rec.getRecWidth();
        System.out.println("Area of rectangle of length "+myLen+" and width "+myWid+" is "+rec.recArea());
        System.out.println("Perimeter of rectangle of length "+myLen+" and width "+myWid+" is "+rec.recPerimeter());

        //default rectangle
        Rectangle defaultRec = new Rectangle();
        double defaultLen = defaultRec.getRecLength();
        double defaultWid = defaultRec.getRecWidth();
        System.out.println("Area of rectangle of length "+defaultLen+" and width "+defaultWid+" is "+defaultRec.recArea());
        System.out.println("Perimeter of rectangle of length "+defaultLen+" and width "+defaultWid+" is "+defaultRec.recPerimeter());

        //square
        Rectangle squareRec = new Rectangle(5);
        double squareLen = squareRec.getRecLength();
        double squareWid = squareRec.getRecWidth();
        System.out.println("Area of rectangle of length "+squareLen+" and width "+squareWid+" is "+squareRec.recArea());
        System.out.println("Perimeter of rectangle of length "+squareLen+" and width "+squareWid+" is "+squareRec.recPerimeter());



    }
}
