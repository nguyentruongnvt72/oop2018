package week4.task2;

public class Shape {
    public String color = "red";
    public boolean filled = true;
    Shape(String color, String fille){
         this.color = "red";
         filled = true;
    }
    public Shape(String Color, boolean Filled){
        color = Color;
        filled = Filled;
    }

    public Shape() {
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return color + " " + filled;
    }
}
