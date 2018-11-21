package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable<T>> T maximum(ArrayList<T> mang)
    {
        T max = mang.get(0);
        for(int i =0 ; i<mang.size(); i++) {
            if (mang.get(i).compareTo(max) > 0) {
                max = mang.get(i);
            }
        }
        return max;
    }
}
