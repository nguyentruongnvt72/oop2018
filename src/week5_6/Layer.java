package week5_6;

import java.util.ArrayList;
import java.util.Iterator;


public class Layer {
    private ArrayList<Shape> listShape = new ArrayList<Shape>();
    public void deleteTriagle() {
        Iterator<Shape> temp = listShape.iterator();
        while (temp.hasNext()) {
            Shape shape = temp.next();
            if (shape instanceof Triangle) {
                temp.remove();
            }
        }
    }
    public void deleteCricle(){
        Iterator<Shape> temp = listShape.iterator();
        while(temp.hasNext()){
            Shape shape = temp.next();
            if(shape instanceof Circle){
                temp.remove();
            }
        }
    }

    public boolean isEmptyTriagle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmptyCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                return false;
            }
        }
        return true;
    }
    public void addShape(Shape b){
        listShape.add(b);
    }
}
