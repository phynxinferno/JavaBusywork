// This problem would've been kinda fun(if not a little too easy) if they didn't tell you exactly how to do it. Now it's just more tedium. Guess this is meant to teach you about the day-to-day experience of using a boilerplate-focused language
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static Scanner inStream = new Scanner(System.in);
    public static void main(String[] args) {
        // useless input fields~
        System.out.println("Enter first number:");
        double target = inStream.nextDouble();
        System.out.println("Number of decimal places:");
        double savedPlaces = Math.pow(10, inStream.nextDouble());
        System.out.println(Math.round(target * savedPlaces)/savedPlaces);
    }
}