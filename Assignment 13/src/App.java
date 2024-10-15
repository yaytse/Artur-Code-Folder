import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //all the methods and variables we need
        Methods calculator = new Methods();
        Scanner input = new Scanner(System.in);
        boolean value = false;
        
        //while the input value isn't 
        while (value == false){
        System.out.println("Enter '1' if you want to find perimeter of a ractangle\nEnter '2' if you want to find surface area of a cube\nEnter '3' if you want to find area of a circle");
        String input1 = input.nextLine();  

        try {
            int userprompt = Integer.valueOf(input1);
            if (userprompt == 1){
                calculator.userinput1();
                value = true;
            }
            else if(userprompt == 2) {
                calculator.userinput2();
                value = true;
            }
            else if(userprompt == 3){
                calculator.userinput3();
                value = true;
            }
            else{
                System.out.println("Please input a correct number.");
                continue;
            }}
        catch (NumberFormatException ex) {
            System.out.println("Please, don't input a string :)");
            value = false;
            }
        }


    }
}
