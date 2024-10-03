//Assignment 8
//Artur Mararash    
//10/02/2024


public class BigOrSmallRunner {
    public static void main(String[] args) throws Exception {
        BigOrSmall numbers = new BigOrSmall();
        numbers.check( 10, 20);		
		numbers.check( 20, 10);	
		numbers.check( 20, 20);
		numbers.check( 10, 10);	
		numbers.check( 0, 1);	
		numbers.check( 1, 0 );	
		numbers.check( 3, 5);	
		numbers.check( 5, 3 );	
		numbers.check( 5342, 323 );
    }
}
