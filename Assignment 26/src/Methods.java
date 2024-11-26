import java.util.Random;

public class Methods {
    public int printNums(int a, int b){
        System.out.println(a + " -- " + b + "\n");
        if (a > b){
            System.out.println("Largest == " + b); 
            System.out.println("Smallest ==  " + a + "\n\n");    
        }
        else{
            System.out.println("Largest == " + a); 
            System.out.println("Smallest == " + b + "\n\n"); 
        }
    return 0;

    }
}