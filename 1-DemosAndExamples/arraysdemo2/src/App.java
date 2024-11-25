import java.util.Scanner;

public class App {
    private static Scanner inp = new Scanner(System.in);
    private static int[] nums = null; //Declare the array

    public static void main(String[] args) throws Exception {

        System.out.println("How many numbers would you like to input? ");
        int SIZE = inp.nextInt();

        nums = new int[SIZE];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Please enter an integer: ");
            nums[i] = inp.nextInt();
        }
        printArr();

        //Double the array elements
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
        
        printArr();
    }
        
    private static void printArr() {
        System.out.println("Your list of numbers is: ");
        for(int i = 0; i<nums.length-1; i++) {
                System.out.print(nums[i] + ", ");
        }
        //Output the last value WITH a new line
        System.out.println(nums[nums.length-1] +".");
    }
}