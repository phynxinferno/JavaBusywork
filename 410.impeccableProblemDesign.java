import java.lang.Math;
import java.util.Scanner;
import java.math.BigInteger;
class main {
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.println(gcd(inStream.nextInt(), inStream.nextInt()));
    }
    public static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}