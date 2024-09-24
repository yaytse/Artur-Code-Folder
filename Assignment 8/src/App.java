//Assignment 8
//Artur Mararash
//09/24/2024

import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
            Scanner keyboard = new Scanner(System.in);
            
            int intOne, intTwo;
            double doubleOne, doubleTwo; 

            System.out.print("Enter a first integer: ");
            intOne = keyboard.nextInt();
      
            System.out.print("Enter a second integer: ");
            intTwo = keyboard.nextInt();
            
            System.out.print("Enter a first double: ");
            doubleOne = keyboard.nextInt();
      
            System.out.print("Enter a second double: ");
            doubleTwo = keyboard.nextInt();

            System.out.println("integer one = " + intOne);
            System.out.println("integer two = " + intTwo);

            System.out.println("double one = " + doubleOne);
            System.out.println("double two = " + doubleTwo);

            System.out.println("intOne + intTwo = " + (intTwo+intOne));
            System.out.println("doubleOne + DoubleTwo = " + (doubleOne+doubleTwo));
    }
}
