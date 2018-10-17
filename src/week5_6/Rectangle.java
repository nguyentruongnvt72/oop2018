package week5_6;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override

    public double getArea(){
        return width*height;
    }
    @Override

    public double getPerimeter(){
        return (width+height)*2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
