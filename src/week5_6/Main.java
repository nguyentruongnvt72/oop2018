package week5_6;

public class Main {
    public static void main(String Args[]){
        Point point1 = new Point(1.0,1.5);
        Point point2 = new Point(4.6,1.7);
        Point point3 = new Point(5.8,7.9);
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Triangle temp1 = new Triangle(point1,point2,point3);
        Triangle temp2 = new Triangle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        layer1.addShape(temp1);
        layer1.addShape(temp2);
        layer1.deleteTriagle();
        Layer layer2 = new Layer();
        layer2.addShape(circle1);
        layer2.addShape(circle2);
        diagram.addLayer(layer1);
        diagram.addLayer(layer2);
        diagram.deleteCricle();
        System.out.println(diagram.isEmtpryCircle1());
        System.out.print(layer1.isEmptyTriagle());
    }
}
