public class l604 {
    public static void main(String[] args) {
        Fraction def = new Fraction();
        def.print();
        System.out.println("Default value check: " + def.equals(new Fraction(0, 1)));

        Fraction f1 = new Fraction(53, 54);
        f1.print();

        Fraction f2 = new Fraction(f1);
        f2.print();

        System.out.println("Assigned value check: " + f1.equals(f2));
    }
}

class Fraction {
    int den;
    int num;

    public Fraction(int n, int d) {
        this.num = n;
        this.den = d;
    }

    public Fraction(Fraction f) {
        this.num = f.num;
        this.den = f.den;
    }
    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
    public boolean equals(Fraction other) {
        return this.num == other.num && this.den == other.den;
    }
}