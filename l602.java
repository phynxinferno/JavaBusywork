import java.util.Scanner;

// Q1: 
/*
 * a: r = q
 * b: r = p
 * c: r = p
 * d: r = p
 * e: r = q
 */

public class l602 {
    public static void main(String[] args) {
        // DO NOT ALTER THE MAIN --- Add your Fraction class
        Scanner s = new Scanner(System.in);
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction c = new Fraction();
        Fraction d = new Fraction();

        // set fractions with user input
        a.num = s.nextInt();
        a.den = s.nextInt();
        b.num = s.nextInt();
        b.den = s.nextInt();
        c.num = s.nextInt();
        c.den = s.nextInt();

        // call instance methods
        a.plusEquals(b);
        d = a.plus(c);
        d.reduce();

        // print fractions with instance method
        a.print();
        b.print();
        c.print();
        d.print();
    }

}

class Fraction {
    int den;
    int num;

    public double size() {
        return Math.abs((double) this.num / this.den);
    }

    public Fraction larger(Fraction other) {
        if (this.size() >= other.size()) {
            return this;
        } else {
            return other;
        }
    }

    public void plusEquals(Fraction other) {
        this.num = (this.num*other.den) + (other.num*this.den);
        this.den *= other.den;
    }

    public void reduce() {
        int gcd = gcd(this.num, this.den);
        this.num /= gcd;
        this.den /= gcd;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction plus(Fraction other) {
        Fraction that = new Fraction();
        that.den = other.den * this.den;
        that.num = (this.den*other.num) + (other.den*this.num);
        return that;
    }

    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}
