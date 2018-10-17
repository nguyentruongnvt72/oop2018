package week5_6;

public class Triangle extends Shape {
    private Point a,b,c;

    public Triangle(){
        a = new Point(1,1);
        b = new Point(2,3);
        c = new Point(4,5);
    }

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter(){
        double dic1 = this.a.Distance(this.b);
        double dic2 = this.a.Distance(this.c);
        double dic3 = this.b.Distance(this.c);
        return dic1+ dic2 + dic3;
    }

    @Override
    public double getArea(){
        double dic1 = this.a.Distance(this.b);
        double dic2 = this.a.Distance(this.c);
        double dic3 = this.b.Distance(this.c);
        double tmp = (dic1+dic2+dic3)/2;
        return Math.sqrt(tmp*(tmp-dic1)*(tmp-dic2)*(tmp-dic3));
    }
}
