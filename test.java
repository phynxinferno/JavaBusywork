
// Second in-class assignment, active 11/22/22
import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void println(String text) {
    System.out.println(text);
  }

  public static void print(String text) {
    System.out.print(text);
  }

  public static String players[] = new String[2];
  public static byte scores[] = { 0, 0 };

  public static Scanner inStream = new Scanner(System.in);

  public static void playRound(byte count) {
    for (byte iter1 = 0; iter1 != 2; iter1++) {
      println("Round " + count + ": " + players[iter1] + "'s turn!");
      byte scoreAdd = 0;
      do {
        byte random;
        println(players[iter1] + " rolls a " + (random = (byte) (Math.round(Math.random() * 5) + 1))
            + ". Total score: " + (scores[iter1] + (scoreAdd += random)));
        if (scoreAdd > 17) {
          println(players[iter1] + " has busted by rolling more than 17!");
          scoreAdd = 0;
          break;
        }
        println("Would you like to roll again?");
      } while (inStream.nextLine().equals("y"));
      scores[iter1] += scoreAdd;
    }
    println("The score after round " + count + " is: \n" + players[0] + ": " + scores[0] + "\n" + players[1] + ": " + scores[1]);
  }

  public static void main(String[] args) {
    println("Welcome to the Game!");
    byte iter;
    for (iter = 0; iter <= 1; iter++) {
      println("What is the name of player " + (iter + 1) + "?");
      players[iter] = inStream.nextLine();
    }
    println("How many rounds would you like to play?");
    byte rounds = inStream.nextByte();
    inStream.nextLine();
    for(iter = 1; iter <= rounds; iter++); {
      println(iter + "");
      playRound((byte) iter);
    }
    while(scores[0] == scores[1]) {
        println("It's a tie! Let's play another round!");
        playRound((byte)(rounds++));
    }
  }
}