// The LAST finnicky basic math problem that tells you how to solve it in the course(challenge, undoubtedly not the entire course)

import java.util.Scanner;

class Main {
    public static Scanner inStream = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter cents:");
        int root = inStream.nextInt();
        // yes this is a bad way to do this and yes I did it earlier too but honestly Idc at this point I just want to be done
        System.out.println("Quarters " + root/25 + ", dimes " + root % 25 / 10 + ", nickels " + root % 25 % 10 / 5 + ", pennies " + root % 25 % 10 % 5);
    }
}
