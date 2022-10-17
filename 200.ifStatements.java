// about time lmao
import java.lang.Math;
import java.util.Scanner;
class main {
  public static void println(String text) {
    System.out.println(text);
  }

  public static void print(String text) {
    System.out.print(text);
  }

  public static void main(String[] args) {
    Scanner inStream = new Scanner(System.in);
    println("Enter first number:");
    int num = inStream.nextInt();
    println("Enter second number:");
    int num1 = inStream.nextInt();
    print("Result: ");
    if(num1 == num) {
      print("The numbers are equal");
    } else {
      print(num > num1 ? num + " is larger than " + num1 : num1 + " is larger than " + num);
    }
  }
}