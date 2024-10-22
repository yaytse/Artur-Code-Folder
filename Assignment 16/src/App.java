//Assignment 16
//Artur Mararash
//10/16/2024

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A: ");
        double a = input.nextDouble();
        System.out.print("Enter side B: ");
        double b = input.nextDouble();
        System.out.print("Enter side C: ");
        double c = input.nextDouble();

        Methods test = new Methods(a,b,c);

        test.calcPerimeter();
        test.calcArea();
        test.print();
    }
}
