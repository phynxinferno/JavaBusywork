// I have access to all the submissions for this problem for some reason, behold the least efficient solution ever submitted in the history of this unit(including last year)
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
    println("Simple Math Quiz\n");
    String[] probs = { "placeholder so I don't have to subtract","5+2", "3*6", "88-3" };
    int[] ans = { 21, 7, 18, 85 };
    int pts = 0;
    for(int iter = 1; iter < 4; iter++) {
      println("Question " + iter + ": \n"  + probs[iter] + " = ");
      if(inStream.nextInt() == ans[iter]) {
        pts++;
        println("Correct.");
      } else {
        println("Incorrect. " + probs[iter] + " = " + ans[iter] + "");
      }
      println("");
    }
    print("Score: " + pts + "/3");
  }
}
