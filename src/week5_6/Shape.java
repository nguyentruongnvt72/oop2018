package week5_6;

abstract class Shape {
    protected String color;
    protected boolean filled;
    protected boolean isMoving;
    abstract double getArea();
    abstract double getPerimeter();
    public String getColor() {
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

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }
}
