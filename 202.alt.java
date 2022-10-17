import java.util.Scanner;

class main {
    public static void main(String[] args) {
        int nums[] = new int[3];
        String count[] = {"first", "second", "third"};
        Scanner inStream = new Scanner(System.in);
        System.out.println("Enter " + count[0] + " number:");
        nums[0] = inStream.nextInt();
        System.out.println("Enter " + count[1] + " number:");
        nums[1] = inStream.nextInt();
        System.out.println("Enter " + count[2] + " number:");
        nums[2] = inStream.nextInt();
        if(nums[0] < nums[1]) {
            if(nums[0] < nums[2]) {
                System.out.println("The smallest number is: " + nums[0]);
            } else {
                System.out.println("The smallest number is: " + nums[2]);
            }
        } else {
            if(nums[1] < nums[2]) {
                System.out.println("The smallest number is: " + nums[1]);
            } else {
                System.out.println("The smallest number is: " + nums[2]);
            }
        }
    }
}
