import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printRollDice(n);

    }

    //Write your method(s) here
    public static void printRollDice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Roll " + i + " is a " + (int)(Math.random()*6+1));
        }
    }

}
