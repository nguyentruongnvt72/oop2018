package week2.task1;

import week2.task2.Fraction;

public class Task1 {
    public static int[] so = new int[5];

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b == 0){
            return a;
        }
        else return gcd(b, a%b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    //thu
    /*public static void main(String[] abc){
        Task1 text = new Task1();
        text.so[0]=1;
        text.so[1]=2;
        text.so[2]=3;
        text.so[3]=5;
        text.so[4]=8;
        Fraction truong = new Fraction(2,3);


        //System.out.println(text.gcd(32, 12));

        //System.out.println(text.fibonacci(5));
    }*/
}
