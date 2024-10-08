
import java.util.Scanner;


public class Sum
{
	//instance variables
	private double one, two, sum;
	Scanner NumScan = new Scanner(System.in);
	public void setNums(double num1, double num2)
	{
		System.out.print("Enter the first number: ");
		one = NumScan.nextDouble();
		System.out.print("Enter the second number: ");
		two = NumScan.nextDouble();
	}

	public void sum( )
	{
		sum = one + two;
	}

	public void print( )
	{
		System.out.println("The sum of these two numbers is: " + sum);
	}
}
