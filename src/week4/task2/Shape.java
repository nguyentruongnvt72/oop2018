package week4.task2;

public class Shape {
    private String color = "red";
    private boolean filled = true;
    Shape(){
         color = "red";
         filled = true;
    }
    Shape(String Color, boolean Filled){
        color = Color;
        filled = Filled;
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
