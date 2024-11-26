import java.util.Random;

public class Methods {
    public static int getRandomNum()
	{
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        return rand_int1;
    }
    public void printNums(){
        System.out.println("Here are two random numbers:");
        int num1 = getRandomNum();
        int num2 = getRandomNum();
        System.out.println(num1 + " and " + num2 + "\n");
        if (num1 > num2){
            System.out.println("The smallest number is " + num2); 
            System.out.println("The biggest number is " + num1 + "\n\n");    
        }
        else{
            System.out.println("The smallest number is " + num1); 
            System.out.println("The biggest number is " + num2 + "\n\n"); 
        }
    }
    
}