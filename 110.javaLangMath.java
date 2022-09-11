import java.util.Scanner;
import java.lang.Math;

class Main {
    // Scanner doesn't have to been named any specific thing, just thought I'd change my naming scheme in preparing for scanning for other stuff
    /*
     * WIP
     * Still not accepted by cboj despite returning the same as the example
     */
    public static Scanner inStream = new Scanner(System.in);
    public static void lineBreak(String[] args) {
        System.out.println("\n****\n");
    }
    public static void main(String[] args) {
        System.out.println("Square Root");
        // USE YOUR INPUT FIELDS AAAAAAAAAAAAAAAAAAAAAAAA
        System.out.println("Input a positive number:");
        // tabnine is starting to reccomend "AAAAAAAAAAAAAAAAAAAAAAAA" in comments. love this course.
        double square = Math.abs(inStream.nextDouble());
        System.out.println("The square root of " + square + " is " + Math.sqrt(square));
        lineBreak(args);
        System.out.println("Exponents");
        System.out.println("Input an integer:");
        // I GET IT THERE ARE MULTPLE DATA TYPES CAN I MAKE ACTUALLY USEFUL CODE NOW???
        int root = inStream.nextInt();
        System.out.println("Input a second integer:");
        int power = inStream.nextInt();
        // completely inconsistent formatting- is it common language or not? There wasn't a colon the first time
        System.out.println(root + " to the power of " + power + " is: " + Math.pow(root, power));
        lineBreak(args);
        System.out.println("Rounding, Ceiling and Floor");
        System.out.println("Input a decimal value:");
        double floating = inStream.nextDouble();
        System.out.println(floating + " rounds to " + Math.round(floating));
        System.out.println(floating + " ceiling is " + Math.ceil(floating));
        System.out.println(floating + " floor is " + Math.floor(floating));
        System.out.println("Random");
        System.out.println("Enter the lower limit:");
        int lowerLimit = inStream.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimit = inStream.nextInt();
        System.out.println("A random number between " + lowerLimit + " and " + upperLimit + " is " + (Math.random()*upperLimit + lowerLimit));
    }
}