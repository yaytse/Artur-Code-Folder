//Assignment 17
//Artur Mararash
//10/22/2024

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance: "); // input of all the numbers
        int distance = input.nextInt();
        System.out.print("Enter the hours: ");
        int hours = input.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = input.nextInt();

        Methods speed = new Methods(distance, hours, minutes); // sets the numbers

        speed.MPH(); //speed
        speed.print(); //prints the result
    }
}