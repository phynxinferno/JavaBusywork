import java.util.Scanner;
import java.lang.Math;

class Main {
    public static Scanner inStream = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a positive, 4-digit number (1111 to 9999): ");
        int integer = inStream.nextInt();
        System.out.println("The digits of " + integer + " are " + integer/1000 + ", " + (integer % 1000)/100 + ", " + ((integer % 1000) % 100)/10 + ", and " + (((integer % 1000) % 100) % 10) + ".");
    }
}
