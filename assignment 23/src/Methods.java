public class Methods {
    public static boolean isCoolNumber( int num )
	{
        if (num%3 == 1 && num%4 == 1 && num%5 == 1 && num%6 == 1){
		 return true;
        }
    return false;
    }
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