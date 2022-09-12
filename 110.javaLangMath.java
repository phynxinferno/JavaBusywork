import java.util.Scanner;
import java.lang.Math;

class Main {
    // Scanner doesn't have to been named any specific thing, just thought I'd change my naming scheme in preparing for scanning for other stuff
    /*
     * NO LONGER WIP, Deleted all the comments because I don't feel like writing anything extra at this point I'm so done with this class
    */
    public static Scanner inStream = new Scanner(System.in);
    public static void lineBreak(String[] args) {
        System.out.println("\n****\n");
    }
    public static void main(String[] args) {
        System.out.println("Square Root");
        System.out.println("Input a positive number:");
        int square = Math.abs(inStream.nextInt());
        System.out.println("The square root of " + square + " is " + Math.sqrt(square));
        lineBreak(args);
        System.out.println("Exponents");
        System.out.println("Input an integer:");
        int root = inStream.nextInt();
        System.out.println("Input a second integer:");
        int power = inStream.nextInt();
        System.out.println(root + " to the power of " + power + " is: " + Math.pow(root, power));
        lineBreak(args);
        System.out.println("Rounding, Ceiling and Floor");
        System.out.println("Input a decimal value:");
        double decimal = inStream.nextDouble();
        System.out.println(decimal + " rounds to " + Math.round(decimal));
        System.out.println(decimal + " ceiling is " + Math.ceil(decimal) + "  ");
        System.out.println(decimal + " floor is " + Math.floor(decimal));
        lineBreak(args);
        System.out.println("Random");
        System.out.println("Enter the lower limit:");
        int floor = inStream.nextInt();
        System.out.println("Enter the upper limit:");
        int ceil = inStream.nextInt();
        System.out.println("A random number between " + floor + " and " + ceil + " is " + Math.random() * (ceil - floor) + floor);
    }
}