package week4.task2;

import week4.task1.Cam;

public class Circle extends Shape {
    private double radius = 1.0;
    private double PI = 3.14;
    Circle(){

    }
    Circle(double Radius){
        radius = Radius;
    }
    Circle(double Radius, String Color, boolean Filled){
        radius = Radius;
        setColor(Color);
        setFilled(Filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double Radius){
        radius = Radius;
    }
    public double getArea(){
        return PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
        return getArea() + " " + getPerimeter();
    }
}