//Assignment 37
//Artur Mararash
//December 11

import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the game!\nA reverse raffle is a raffle draw where the name drawn from a hat they DOES NOT win.\nThe last name drawn is the actual winner.");
    
        ArrayList<String> names = new ArrayList<>();
        boolean input = true;
        System.out.println("Please put at least 10 names into the hat: ");
        System.out.println("Press 'Q' to stop putting names in the hat.");
        Scanner scanner = new Scanner(System.in);
        while (input) {
        String i = scanner.next();
            if (i == "q"){
                System.out.println("IF STA");
                input = false;
            }
            else if (i== "Q" && names.size() < 10){
                System.out.println("Please amke sure you have at least 10 names in the hat.");
            }
            else{
                System.out.println("ELSE STA");

                names.add(i);
            }
    }

/*static void nameInp(ArrayList names){
    boolean input = true;
    System.out.println("Please put at least 10 names into the hat: ");
    System.out.println("Press 'Q' to stop putting names in the hat.");
    Scanner scanner = new Scanner(System.in);
    while (input) {
      String i = scanner.nextLine();
        if ((String)i == "q"){
            System.out.println("IF STA");
            input = false;
        }
        else if (i== "Q" && names.size() < 10){
            System.out.println("Please amke sure you have at least 10 names in the hat.");
        }
        else{
            System.out.println("ELSE STA");

            names.add(i);
        }
    }*/
}
}