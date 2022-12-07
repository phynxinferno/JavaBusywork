import java.util.Scanner;

class main {
    public static int println(String text) {
        System.out.println(text);
        return 2;
    }
    public static int print(String text) {
        System.out.print(text);
        return 1;
    }
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        println("Enter integer 1:");
        int range[] = {inStream.nextInt(), println("Enter integer 2:"), inStream.nextInt()};
        int range1[] = (range[0] < range[2]) ? range : new int[]{range[2],2,range[0]};
        println("Print asterisks: ");
        int iter;
        for(iter = range1[0]; iter < range1[2]; iter++) {
            print("*");
        }
        println("");
        println("Countdown seconds:");
        for(iter = range1[2]; iter >= range1[0]; iter--) {
            println(iter + " seconds");
        }
        println("Enter a letter: ");
        char range2[] = {inStream.next().charAt(0), (char) println("Enter a letter:"), inStream.next().charAt(0)};
        inStream.close();
        if(range2[0] > range2[2]) {
            range2 = new char[]{range2[2], range2[1], range2[0]};
        };
        for(iter = range2[0]; iter <= range2[2]; iter++) {
            println("Give me a " + (char)iter);
        }
        println("Output multiples - start at integer 1 and multiply by integer 2 stop when greater than 1000");
        for(iter = range[0]; iter <= 1000; iter *= range[2]) {
            println(Integer.toString(iter));
        }
    } 
}