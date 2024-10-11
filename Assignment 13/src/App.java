import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Methods calculator = new Methods();
        Scanner input = new Scanner(System.in);
        int userprompt;
        System.out.println("Enter '1' if you want to find perimeter of a ractangle\nEnter '2' if you want to find surface area of a cube\nEnter '3' if you want to find area of a circle");
        userprompt = input.nextInt();
        if (userprompt == 1){
            calculator.userinput1();
        }
        else if(userprompt == 2) {
            calculator.userinput2();
        }
        else if(userprompt == 3){
            calculator.userinput3();
        }

        try {
            if(userprompt < 3 || userprompt >= 150) {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException ex) {
            if(age2 <= 0) {
                System.err.print("Age can not be 0 or negative.");
            }
            else if (age2 >= 150) {
                System.err.print("Age can not be equal to or more than 150.");
            }
            else if (age.contains("#@$")) {
                System.err.print("You did not enter a valid age.");
            }
        }
    }
}
