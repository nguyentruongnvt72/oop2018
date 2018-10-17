package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> listLayer = new ArrayList<>();

    public void deleteCricle(){
        for(int i=0;i<listLayer.size();i++){
            listLayer.get(i).deleteCricle();
        }
    }

    public void addLayer(Layer other){
        listLayer.add(other);
    }

    public boolean isEmtpryCircle1(){
        for(int i=0;i<listLayer.size();i++){
            if(listLayer.get(i).isEmptyCircle()==false){
                return false;
            }
        }
        return true;
    }
}
