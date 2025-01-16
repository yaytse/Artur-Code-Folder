//Assignment 37
//Artur Mararash
//December 11

import java.util.ArrayList;
import java.util.Random;
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
            String i = scanner.nextLine(); // Using nextLine() to get the full input
            
            if (i.equalsIgnoreCase("Q") && names.size() < 10) {
                System.out.println("Please make sure you have at least 10 names in the hat.");
            }
            else if (i.equalsIgnoreCase("Q")) {
                input = false;  // Stop the loop when 'Q' is pressed and at least 10 names are added
            }
            else {
                names.add(i);  // Add name to the list
            }
        }
        // Displays all the names added
        System.out.println("\nNames in the hat: " + names);
        
        Random rand = new Random();

        while (names.size() > 1) {
            // Randomly pick an index of a name to remove
            int index = rand.nextInt(names.size());
            String removedName = names.remove(index); // Remove the name
            System.out.println(removedName + " has been removed.");
            Thread.sleep(2000);
        }

        // At the end, only one name will be left, and they are the winner
        String winner = names.get(0);
        System.out.println("\nAnd the winner is... " + winner + "!");
    }
}
