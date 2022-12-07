import java.util.Scanner;
class main {
    public static void main(String args[]){
        Scanner inStream = new Scanner(System.in);
        printRect(inStream.nextLine().charAt(0), inStream.nextInt(), inStream.nextInt());
    }
    public static void printRect (char c, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}