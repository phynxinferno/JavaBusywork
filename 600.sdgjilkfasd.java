import java.lang.Math;

// Q1

class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.num = 2;
        f.den = 7;
    }
}


class Fraction {
    public int num, den;
}

/*
 * Q2: p is unintialized(value is null). Attempting to set num would result in NullPointerException
 */
/*
 * Q3: Code would finish with status code 0. Nothing would be outputted. 
 */

// Q4
class q4fract extends Fraction {
    public void invert() {
        int temp = num;
        num = den;
        den = temp;
    }
    public void add(int addNum, int addDen) {
        num = num * addDen + addNum * den;
        den *= addDen;
    }
    public void multiply(int multNum, int multDen) {
        num *= multNum;
        den *= multDen;
    }
    public void absolute() {
        den = Math.abs(den);
        num = Math.abs(num);
    }
}
// Assuming I'm not allowed to make both 1/1
class q4 {
    public static void main(String[] args) {
        q4fract f1 = new q4fract(), f2 = new q4fract();
        f1.num = 1;
        f1.den = 2;
        f2.num = 1;
        f2.den = 3;
        
    }
}