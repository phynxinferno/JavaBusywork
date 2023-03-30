import java.util.Scanner;

class main {
    public static void main(String args[]) {
        String target = new Scanner(System.in).nextLine();
        String reverse = "";
        for(int i = target.length() - 1; i >= 0; i--) {
            reverse += target.charAt(i);
        }
        int largest = 0;
        int ln;
        checkLoop:
        for(int startPoint = 0; startPoint < target.length(); startPoint++) {
            for(int endPoint = startPoint + 1; endPoint <= target.length(); endPoint++) {
                String sub = target.substring(startPoint, endPoint);
                if(reverse.contains(sub)) {
                    ln = endPoint - startPoint;
                    if(ln > largest) {
                        largest = ln;
                    }
                }
                if(largest == target.length()) {
                    break checkLoop;
                }
            }
        }
        System.out.println(largest);
    }
}
