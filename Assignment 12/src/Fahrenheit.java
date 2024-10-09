

public class Fahrenheit
{
	public double FtoC(double temp)
	{
		double newNum;
		newNum = (5/9)*(temp - 32);
		return newNum;

	}

	public double CtoF(double temp)
	{
		double newNum;
		newNum = (9/5)*(temp) + 32;
		return newNum;
	}


}