import java.util.Scanner;
class main {
    public static void main(String args[]){
        Scanner inStream = new Scanner(System.in);
        printRectHollow(inStream.nextLine().charAt(0), inStream.nextInt(), inStream.nextInt());
    }
    public static void printRectHollow (char c, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}