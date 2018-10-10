package week4.task2;

public class Square extends Rectangle{
    Square(){

    }
    Square(double side){
        setWidth(side);
        setLength(side);
    }
    Square(double side, String Color, boolean Filled){
        setLength(side);
        setWidth(side);
        setColor(Color);
        setFilled(Filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }


    public void setLength(double Length) {
        setLength(Length);
    }
    public void setWidth(double Width){
        setLength(Width);
    }

    public String toString(){
        return getSide() + " ";
    }

}
