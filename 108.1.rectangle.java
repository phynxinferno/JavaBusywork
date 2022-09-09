import java.util.*;
/* 
Note: [CB]OJ makes you use integers for some reason- ig they don't like functionality. 
Same thing with it being println every time. They make input fields then don't use them. Thanks.
*/
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