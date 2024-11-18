public class Methods {
    //Method for checking if the number is cool
    public static boolean isCoolNumber( int num )
	{
        if (num%3 == 1 && num%4 == 1 && num%5 == 1 && num%6 == 1){
		 return true;
        }
    return false;
    }
    // Method that goes through all the numbers in the range
    public static int countCoolNumbers( int stop )
	{
        int counter = 0;
		for (int i = 5; i < stop; i++){
            if(isCoolNumber(i) == true){
                counter++;
            }
        }
    return counter;
	}
}