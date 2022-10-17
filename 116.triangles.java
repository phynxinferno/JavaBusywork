import java.util.Scanner;
import java.lang.Math;

class Main {

  public static void println(String text) {
    System.out.println(text);
  }

  public static void print(String text) {
    System.out.print(text);
  }

  public static double roundToPlace(double num, int places) {
    double tenPow = Math.pow(10, places);
    return Math.round(num * tenPow) / tenPow;
  }

  public static void main(String[] args) {
    Scanner inStream = new Scanner(System.in);
    println("Enter three sides of a triangle:");
    double sides[] = new double[3];
    int iterator;
    for (iterator = 0; iterator < 3; iterator++) {
      sides[iterator] = inStream.nextDouble();
    }
    inStream.close();
    int perimeter = (int) (sides[0] + sides[1] + sides[2]);
    double semiP = perimeter / 2.0;
    double area = roundToPlace(Math.sqrt(semiP * (semiP - sides[0]) * (semiP - sides[1]) * (semiP - sides[2])), 1);
    double radius1 = roundToPlace((sides[0] * sides[1] * sides[2]) / (area * 4), 1);
    double radius = roundToPlace((2 * area) / perimeter, 1);
    double sqSides[] = new double[3];
    for (iterator = 0; iterator < 3; iterator++) {
      sqSides[iterator] = Math.pow(sides[iterator], 2);
    }
    double angles[] = new double[3];
    angles[0] = Math
        .round(Math.toDegrees(Math.acos((sqSides[1] + sqSides[2] - sqSides[0]) / (2 * sides[1] * sides[2]))) * 10)
        / 10.0;
    angles[1] = Math.round(
        Math.toDegrees(Math.acos((sqSides[0] + sqSides[1] - sqSides[2]) / (2 * sides[0] * sides[1]))) * 10) / 10.0;
    println("\nHere are the calculations:\nPerimeter = " + perimeter
        + "\nSemi-perimeter = " + semiP
        + "\nArea = " + area + "\nRadius of the Circumscribed Circle = " + radius1
        + "\nRadius of the Inscribed Circle = " + radius + "\nAngle X = " + angles[0]
        + "\nAngle Y = " + Math.round((180 - (angles[0] + angles[1])) * 10) / 10.0 + "\nAngle Z = " + angles[1]);
  }
}

