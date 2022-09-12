// idek man we've been doing this same stuff since one of the first questions and I think I get java lang math now one the 1^10^10th question of it ig it's a real world connection now???

import java.lang.Math;
import java.util.Scanner;

class Main {
    public static Scanner inStream = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Temp in F:");
       Long farenheit = inStream.nextLong();
       System.out.println("Temp in C:");
       System.out.println(Math.round((farenheit - 32)*(5.0/9.0)*10) / 10.0);
    }
}
