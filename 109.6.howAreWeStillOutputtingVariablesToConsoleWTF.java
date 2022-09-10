/*
haha reverse funny number
I am grasping at straws for any sort of stimulus right now
AAAAAAAAAAAAAAAAAAAAAAAA
*/
import java.util.Scanner;

class Main {
    public static Scanner scanner = new Scanner(System.in);
    // also I didn't mention this betfore but this value is used once. making it a constant is a waste of space and time. but so is a lot of this course.
    public static final String cb = "Colonel By";
    public static void main(String[] args) {
        System.out.println("Where were you born?  Enter a string value:");
        String city = scanner.nextLine();
        System.out.println("What is your middle initial? Enter a character:");
        Character initial = scanner.nextLine().charAt(0);
        System.out.println("What year were you born?  Enter the 4 digit integer value:");
        Short year = scanner.nextShort();
        System.out.println("Pick a number between 16 and 17.  Enter the decimal number:");
        float decimal = scanner.nextFloat();
        System.out.println("Thank you for your input.");
        System.out.println(city + " is beautiful.");
        // This actually took me hours to figure out because of a stupid grammar mistake in the correct answer. pls send help.
        System.out.println(initial + ", can I call you, \"" + initial + "\" - I think you must be " + year + " + " + decimal + " years old and attend \"" + cb + "\".");
    }
}
