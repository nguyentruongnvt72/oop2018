package week11;

import java.util.ArrayList;

public class Task1 {
    public static <T extends Comparable<T> > void sapxep(ArrayList<T> mang) {
        for(int i =0 ; i<mang.size()-1; i++) {
            for(int j=i+1; j<mang.size(); j++){
                if(mang.get(i).compareTo(mang.get(j)) <= 0 ){
                    T temp = mang.get(i);
                    mang.add(i, mang.get(j));
                    mang.add(j, temp);
                }
            }
        }
        System.out.println(mang);

    }

}
