package week5_6;

public class Square extends Rectangle {

    public Square(double side){
        super(side,side);
    }

    public Square(){
        super();
    }

    @Override
    public double getArea(){
        return super.getArea();
    }

    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
}
