package org.spg.training;

public class Rectangle {
    private double recLength;
    private double recWidth;

    public Rectangle(double len, double wid){
        this.recLength = len;
        this.recWidth = wid;
    }

    public double getRecLength(){
        return this.recLength;
    }
    public double getRecWidth() {
        return this.recWidth;
    }
    //overloading constructor to take no parameter
    public Rectangle(){
        this.recLength = 1;
        this.recWidth = 1;
    }
    //overloading constructor to take single parameter
    public Rectangle(double len){
        this.recLength = len;
        this.recWidth = len;
    }

    //method to find area
    public double recArea(){
        double area = recLength*recWidth;
        return area;
    }

    //method to find perimeter
    public double recPerimeter(){
        double perimeter = 2*(recLength+recWidth);
        return perimeter;
    }

}
