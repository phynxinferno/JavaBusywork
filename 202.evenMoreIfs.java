import java.util.Scanner;

class main {
    public static int cycle(int num) {
        num++;
        if(num > 2) {
            num = 0;
        }
        return num;
    }
    public static void main(String[] args) {
        int iter;
        int nums[] = new int[3];
        String count[] = {"first", "second", "third"};
        Scanner inStream = new Scanner(System.in);
        for(iter = 0; iter < 3; iter++) {
            System.out.println("Enter " + count[iter] + " number:");
            nums[iter] = inStream.nextInt();
        }
        inStream.close();
        int cycled;
        for(iter = 0; iter < 3; iter++) {
            cycled = cycle(iter);
            if(nums[iter] < nums[cycled] && nums[iter] < nums[cycle(cycled)]) {
                System.out.println("The smallest number is: " + nums[iter]);
                break;
            }
        }
        if(iter == 3) {
            System.out.println("The numbers are equal");
        }
    }
}