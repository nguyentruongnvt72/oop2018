package week5_6;

public class Circle extends Shape  {
    static final double PI = 3.14;
    private double radius;
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return PI*radius*2;
    }

}

