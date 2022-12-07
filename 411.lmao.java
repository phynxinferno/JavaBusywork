import java.util.*;
public class Main {
  public static void main(String[] args) {
  //DO NOT ALTER THIS MAIN
     //collect user input
     Scanner s = new Scanner(System.in);

     String line= s.nextLine();


    //Call to isLetter
    System.out.println(isLetter(line));

  }
    //write methods here
    public static boolean isLetter(String line) {
        return (line.length() == 1 && Character.isLetter(line.charAt(0)));
    }
}