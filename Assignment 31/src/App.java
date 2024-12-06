//Artur Mararash
//Assignment 31
//Dec 5 2024

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class App
{	
	private static Scanner inp = new Scanner(System.in);
    private static int[] nums = null; //Declare the array
	public static void main( String args[] )
	{

		System.out.println("How many numbers would you like to input? ");
        int SIZE = inp.nextInt();

        nums = new int[SIZE];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Please enter an integer: ");
            nums[i] = inp.nextInt();
        }

		//int[] one = {7, 4,10,0,1,7,6,5,3,2,9, 7};
		
		Array nums = new Array();

		nums.getCount(nums, 3, 5);
		// Print the array for the user to view
		System.out.println(Arrays.toString(one));

		// Sum the values of positions listed (e.g. array[3] to array[6])
		System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));

		// Count the number of occurances of the number in the array
		System.out.println("# of 4s  =  " + getCount(one,4));
		System.out.println("# of 9s  =  " + getCount(one,9));
		System.out.println("# of 7s  =  " + getCount(one,7));



        int[] two = {7,4,2,7,3,4,6,7,8,9,7,0,10,7,0,1,7,6,5,7,3,2,7,9,9,8,7};
		
        System.out.println(Arrays.toString(two));

		// Sum the values of positions listed (e.g. array[3] to array[6])
		System.out.println("sum of spots 3-16  =  " + getSum(two,3,16));
		System.out.println("sum of spots 2-9  =  " + getSum(two,2,9));

		// Count the number of occurances of the number in the array
		System.out.println("# of 0s  =  " + getCount(two,0));
		System.out.println("# of 3s  =  " + getCount(two,3));
		System.out.println("# of 7s  =  " + getCount(two,7));
	}




class Array {

	Array(){

	}
	//getSum() will return the sum of the numbers from start to stop, not including stop
	public int getSum(int[] numArray, int start, int stop)
	{
        int counter = 0;
        for (int i = start; i<=stop; i++){
            counter = counter + numArray[i];
        }
		return counter;
	}


	//getCount() will return number of times val is present
	public int getCount(int[] numArray, int val)
	{
		int counter = 0;
        for (int i = 0; i<=numArray.length - 1; i++){
            if (numArray[i] == val){
            counter = counter + 1;
            }
        }
		System.out.println("# of " + val + " s  =  " + getCount(numArray, val));
		return counter;
	}
}
}