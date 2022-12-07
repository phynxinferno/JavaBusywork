import java.util.Scanner;
class main {
    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.println(isDivisible(inStream.nextInt(), inStream.nextInt()));
    }

}