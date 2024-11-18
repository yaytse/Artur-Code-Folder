import java.util.Scanner;

public class Methods {
    Scanner input = new Scanner(System.in);

    public int userprompt;
    public void input(){
    boolean value = false;
    while (value == false){
        System.out.print("Enter a year: ");
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
    }


    public void checkLeap(){
        if ((userprompt%4 == 0 && userprompt%100!=0) || userprompt%400 == 0){
            System.out.println(userprompt + " is a leap year.");
        }
        else{
        System.out.println(userprompt + " is NOT a leap year.");
        }

}
}
