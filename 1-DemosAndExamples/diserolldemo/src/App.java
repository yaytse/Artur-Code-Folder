import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
            Scanner keys = new Scanner(System.in);
            Random rand = new Random();
            int numRolls;
            int[] outcomes;
            int total = 0;
            double average = 0;

            System.out.println("How many dice do you want to roll? ");
            numRolls = keys.nextInt();
            outcomes = new int[numRolls];
            
            for(int i = 0; i < numRolls; i++){
                int dice1 = rand.nextInt(6) + 1;
                int dice2 = rand.nextInt(6) + 1;
                outcomes[i] = dice1 + dice2;
                System.out.println("Roll number " + i+1 + ": DICE1 = " + dice1 + ", DICE2 = " + dice2 + "; Score = " + outcomes[i]);

            }
            System.out.println("\nThe Game Stats: ");

            for(int i = 0; i < numRolls; i++){
                total = total + outcomes[i];
            }
            average = (double)total/numRolls;
            System.out.println("Toatal: " + total);
            System.out.println("Average: " + average);
        
    }
}
