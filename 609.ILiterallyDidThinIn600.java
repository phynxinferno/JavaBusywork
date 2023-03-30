import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Fraction p = new Fraction(s.nextInt(), s.nextInt());
        Fraction q = new Fraction(s.nextInt(), s.nextInt());
        Fraction.product(p, q).print(); // 1 
        Fraction.abs(q).print();        // 2

        System.out.println(Fraction.isPositive(p)); // 3
        System.out.println(Fraction.isPositive(q)); // 3

    }

}
class Fraction {
    private int num, den;
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private Fraction simplify() {
        int gcd = gcd(num, den);
        return new Fraction(num / gcd, den / gcd);
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public static Fraction product(Fraction p, Fraction q) {
        return new Fraction(p.num * q.num, p.den * q.den);
    }

    public static Fraction abs(Fraction p) {
        return new Fraction(Math.abs(p.num), Math.abs(p.den));
    }

    public static boolean isPositive(Fraction p) {
        return p.num * p.den > 0;
    }

    public void print() {
        Fraction simped = simplify();
        System.out.println(simped.num + "/" + simped.den);
    }
}