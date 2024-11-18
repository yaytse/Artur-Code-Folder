//Artur Mararash
//11/05/2024
//Assignment 24

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the start number: ");
            int a = input.nextInt();
            System.out.print("Enter the end number: ");
            int b = input.nextInt();

            Methods test = new Methods(a,b);
            System.out.println(test.toString());
            System.out.println(test.getTotal());
            System.out.println(test.getEvenCount());
            System.out.println(test.getOddCount());
        }
    }
}
