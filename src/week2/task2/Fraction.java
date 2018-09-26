package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int ucln = Task1.gcd((this.numerator * other.denominator + other.numerator * this.denominator), (this.denominator * other.denominator));
        other.numerator=(this.numerator * other.denominator + other.numerator * this.denominator)/ucln;
        other.denominator=(this.denominator * other.denominator)/ucln ;
        System.out.println(other.numerator + "/" + other.denominator);
        return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int ucln = Task1.gcd(Math.abs(this.numerator * other.denominator - other.numerator * this.denominator), (this.denominator * other.denominator));
        other.numerator=Math.abs((this.numerator * other.denominator - other.numerator * this.denominator)/ucln);
        other.denominator=(this.denominator * other.denominator)/ucln ;
        System.out.println(other.numerator + "/" + other.denominator);
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int ucln = Task1.gcd((this.numerator *other.numerator), (this.denominator * other.denominator));
        other.numerator=(this.numerator*other.numerator)/ucln;
        other.denominator=(this.denominator * other.denominator)/ucln ;
        System.out.println(other.numerator + "/" + other.denominator);
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới

        int ucln = Task1.gcd((this.numerator *other.denominator), (this.denominator * other.denominator));
        other.numerator=(this.numerator*other.denominator)/ucln;
        other.denominator=(this.denominator * other.numerator)/ucln ;
        System.out.println(other.numerator + "/" + other.denominator);
        return null;       
    }
    public boolean equals(Fraction obj){
        if(this.numerator * obj.denominator > obj.numerator * this.denominator){
            System.out.println(this.numerator + "/" + this.denominator + " > " + obj.numerator + "/" + obj.denominator);
            return false;
        }
        else if(this.numerator * obj.denominator < obj.numerator * this.denominator){
            System.out.println(this.numerator + "/" + this.denominator + " < " + obj.numerator + "/" + obj.denominator);
            return false;
        }
        else
            System.out.println(this.numerator + "/" + this.denominator + " == " + obj.numerator + "/" + obj.denominator);
            return true;
    }
    //thu
    /*public static void main(String[] abc){
        Fraction truong = new Fraction(2,3);
        Fraction nguyen = new Fraction(1, 1);
        //System.out.println(truong.add(nguyen).numerator);
        truong.add(nguyen);
        truong.subtract(nguyen);
        //System.out.println(truong.equals(nguyen));
    }*/
}
