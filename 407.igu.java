import java.util.*;
class Main {
  public static void main(String[] args) {
  //DO NOT ALTER THIS MAIN
     //collect user input
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     int low = s.nextInt();
     int high = s.nextInt();
     int step = s.nextInt();

    //Call to 1a
    System.out.println(randomNumber());

    //Call to 1b
    System.out.println(randomNumber(n));

    //Call to 1c
     System.out.println(randomNumber(low,high));

     //Call to 1d
     System.out.println(randomNumber(low,high,step));
  }
  //write methods here
    public static int randomNumber() {
        return ((int)(Math.random()*(5)+1));
    }
    public static int randomNumber(int high) {
        return ((int)(Math.random()*(high-1)+1));
    }   
    public static int randomNumber(int low, int high) {
        return ((int)(Math.random()*(high-low)+low));
    }   
    public static int randomNumber(int low, int high, int step) {
        return ((int)(Math.random()*((high-low)/step))) * step + low;
    }
}