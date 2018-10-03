package week3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        int a=5;
        int b=4;
        int c= Week3.max(a, b);
        Assert.assertEquals(a, c);
    }
    @Test
    public void test1Max(){
        int a=6;
        int b=4;
        int c = Week3.max(a, b);

        assertEquals(c, a);
    }
    @Test
    public void test2Max(){
        int a=5;
        int b=7;
        int c = Week3.max(a, b);

        assertEquals(c, b);
    }
    @Test
    public void test4Max(){
        int a=9;
        int b=4;
        int c = Week3.max(a, b);

        assertEquals(c, a);
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMin0fArray(){
        int[] mang = new int[100];
            mang[0] = 3;
            mang[1] = 1;
            mang[2] = 1;
            mang[3] = 0;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 0);
    }
    @Test
    public void test1Min0fArray(){
        int[] mang = new int[100];
        mang[0] = 3;
        mang[1] = 1;
        mang[2] = 1;
        mang[3] = 0;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 0);
    }
    @Test
    public void test2Min0fArray(){
        int[] mang = new int[100];
        mang[0] = 3;
        mang[1] = 1;
        mang[2] = 1;
        mang[3] = 0;

        int min = Week3.minOfArray(mang);
        assertEquals(min, 0);
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        double weight = 50;
        double height = 1.6;
        String bmi = Week3.calculateBMI(weight, height);
        assertEquals(bmi, "Binh thuong");
    }
    @Test
    public void test1CalculateBMI(){
        double weight = 60;
        double height = 1.6;
        String bmi = Week3.calculateBMI(weight, height);
        assertEquals(bmi, "Thua can");
    }
    @Test
    public void test2CalculateBMI(){
        double weight = 40;
        double height = 1.6;
        String bmi = Week3.calculateBMI(weight, height);
        assertEquals(bmi, "Thieu can");
    }
    @Test
    public void test3CalculateBMI(){
        double weight = 70;
        double height = 1.6;
        String bmi = Week3.calculateBMI(weight, height);
        assertEquals(bmi, "Beo phi");
    }


}
