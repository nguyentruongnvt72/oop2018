package week4.task2;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    Rectangle(){


    }
    Rectangle(double Width, double Length){

        width = Width;
        length = Length;
    }
    Rectangle(double Width, double Length, String Color, boolean Filled){ ;

        width = Width;
        length = Length;
        setColor(Color);
        setFilled(Filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double Width){
        width = Width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double Length) {
        length = Length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return getWidth() + " " + getLength();
    }
}
