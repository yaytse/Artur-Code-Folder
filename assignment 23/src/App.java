import static java.lang.System.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int userprompt = 0;
        boolean value = false;
        while (value == false){
        System.out.print("Enter an integer number: ");
        String input1 = input.nextLine();  
        try {
            userprompt = Integer.valueOf(input1);
            value = true;
        }
        catch (NumberFormatException ex) {
            System.out.println("Please, input an integer :) ");
            value = false;
            }
        }
        System.out.println( Methods.countCoolNumbers(userprompt) + " cool numbers between 6 - " + userprompt);

    }
}
