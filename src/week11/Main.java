package week11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] abc){


        ArrayList<Integer> mangso = new ArrayList<>();
        mangso.add(0);
        mangso.add(2);
        mangso.add(1);
        ArrayList<Character> mangchar = new ArrayList<>();
        mangchar.add('g');
        mangchar.add('a');
        //Task2 so = new Task2();
        //System.out.println(so.maximum(mangso));
        Task1 so1 = new Task1();

        so1.sapxep(mangso);

        so1.sapxep(mangchar);

    }
}
