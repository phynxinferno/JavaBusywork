import java.util.Scanner;
import java.util.Arrays;

class main {
    public static byte rounds = 3;
    public static byte cycle(byte iterator) {
        if(iterator == (rounds - 1)) {
            return (byte)(rounds - iterator - 1);
        } else {
            return (byte)(iterator + 1);
        }
    }
    public static boolean checkFactor(byte fact1, byte fact2) {
        try {
            if(fact1 % fact2 == 0) {
                return true;
            } else return false;
        } catch(ArithmeticException e) {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner inStream = new Scanner(System.in);
        Boolean friends[] = new Boolean[inStream.nextByte()];
        Arrays.fill(friends, true);
        rounds = inStream.nextByte();
        byte iterator;
        byte factors[] = new byte[rounds];
        for(iterator = 0; iterator < rounds; iterator++) {
            factors[iterator] = inStream.nextByte();
        }
        for(iterator = 0; iterator < rounds; iterator++) {
            if(checkFactor(factors[iterator], factors[cycle(iterator)]) || checkFactor(factors[iterator], factors[cycle(cycle(iterator))])) factors[iterator] = 0; 
        }
        for(iterator = 0; iterator < rounds; iterator++) {
            if(factors[iterator] == 0) continue;
            for(int i = 0; i < (friends.length)/factors[iterator]; i+= factors[iterator]) {
                friends[i] = false;
            }
        }
        System.out.println(Arrays.toString(friends));
    }
}