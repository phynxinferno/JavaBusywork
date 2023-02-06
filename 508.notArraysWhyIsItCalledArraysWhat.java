import java.util.Scanner;
class main {
    public static void main(String[] arguments) {
        Scanner inStream = new Scanner(System.in);
        count(Character.toLowerCase(inStream.nextLine().charAt(0)), inStream.nextLine());
    }
    public static void count(char target, String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(Character.toLowerCase(input.charAt(i)) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
