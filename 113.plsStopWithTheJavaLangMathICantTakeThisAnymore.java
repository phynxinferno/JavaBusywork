// Another (very easy but still) problem ruined by TELLING ME THE ANSWER THIS IS IMPOSTOR SYNDROME THE COURSE LET ME ACTUALLY USE MY PROBLEM SOLVING SKILLS PLEASE

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static Scanner inStream = new Scanner(System.in);
    public static void main(String[] args) {
        // these problems must have been written by different authors who all agree that using input fields is dumb why does nearly every interface we build have different formatting but nearly every one puts the actual input field below the one they make
        System.out.println("numerator=");
        int numerator = inStream.nextInt();
        System.out.println("denominator=");
        int denominator = inStream.nextInt();
        int whole = numerator / denominator;
        int remainder = numerator % denominator;
        System.out.println(numerator + " / " + denominator + " is equivalent to " + whole + " and " + remainder + " / " + denominator);
    }    
}
