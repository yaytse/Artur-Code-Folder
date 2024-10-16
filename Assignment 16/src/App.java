//Assignment 16
//Artur Mararash
//10/16/2024

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Methods test = new Methods(5,6,7)
        System.out.print("Enter side A: ");
        double a = input.nextDouble();
        System.out.print("Enter side B: ");
        double b = input.nextDouble();
        System.out.print("Enter side C: ");
        double c = input.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;

        double area= Math.sqrt(s*(s - a)*(s - b)*(s - c));

        System.out.println((int)a + " " + (int)b + " " + (int)c);
        System.out.printf("Area == " + "%.5f", area);
    }
}
