import java.util.Scanner;

public class FarenheitRunner {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Fahrenheit variable1 = new Fahrenheit();

        int promt = 0;
        boolean input = false;
		double temp;

        System.out.println("Enter '1' if you want to convert Fahrenheit to Celsius\nOR\nEnter '2' if you want to convert Celsius to Fahrenheit");
        promt = scan.nextInt();

        while (input == false){
            if (promt == 1){
				System.out.println("Please input temperature in Fahrenheit");
				temp = scan.nextDouble();
				System.out.println(variable1.FtoC(temp) + " C");
                input = true;

            }
            else if(promt == 2){
				System.out.println("Please input temperature in Celsius");
				temp = scan.nextDouble();
				System.out.println(variable1.CtoF(temp) + " F");
                input = true;
            }
            else{
                System.out.println("Please make sure that you input '1' OR '2' (no spaces, comas, etc.)");
                promt = scan.nextInt();
                continue;
            }
        }
    }
}
