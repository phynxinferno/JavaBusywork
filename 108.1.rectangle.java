import java.util.*;
// Note: CBOJ makes you use integers for some reason- ig they don't like functionality
class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my Area Program!");
        System.out.println("Enter the length:");
        int ln = scanner.nextInt();
        System.out.println("Enter the width:");
        int wd = scanner.nextInt();
        System.out.println("Area = " + ln * wd);
    }
}