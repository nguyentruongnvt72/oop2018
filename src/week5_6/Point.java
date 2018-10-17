package week5_6;

public class Point {
    private double X;
    private double Y;

    public Point(){
        this.X = 1.0;
        this.Y = 1.0;
    }

    public Point(double X, double Y){
        this.X = X;
        this.Y= Y;
    }

    public double Distance(Point other){
        double temp1 = Math.pow(this.X- other.X,2);
        double temp2 = Math.pow(this.Y-other.Y,2);
        return Math.sqrt(temp1 + temp2);
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
