import java.util.Scanner;

public class FarenheitRunner {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Fahrenheit variable1 = new Fahrenheit();

        //initilazing all the values I need
        int promt = 0;
        boolean input = false;
		double temp;
        //Asking the user to input what he wants to do
        //I could make another method for all of this but I decided not to. Next time it will be as an another method.
        System.out.println("Enter '1' if you want to convert Fahrenheit to Celsius\nOR\nEnter '2' if you want to convert Celsius to Fahrenheit");
        promt = scan.nextInt();

        // while input isn't 1 or 2 user will be asked to input it
        while (input == false){
            //if user chooses 1 then we use this "if" statement and conver F to C
            if (promt == 1){
				System.out.println("Please input temperature in Fahrenheit");
				temp = scan.nextDouble();
				System.out.printf("%.1f", variable1.FtoC(temp));
                System.out.println("C");
                input = true; //exits the loop

            }
            //if user chooses 2 then we use this "if" statement and conver F to C
            else if(promt == 2){
				System.out.println("Please input temperature in Celsius");
				temp = scan.nextDouble();
				System.out.printf("%.1f", variable1.CtoF(temp));
                System.out.println("F");
                input = true; //exits the loop
            }
            // if user inputs something else then this statement kicks in
            else{
                System.out.println("Please make sure that you input '1' OR '2' (no spaces, comas, etc.)");
                promt = scan.nextInt();
                continue;
            }
        }
    }
}
