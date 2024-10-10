

public class Fahrenheit
{
	//Method that convers Fahremheit to Celsius
	public double FtoC(double temp)
	{
		double newNum;
		newNum = (5/9.0)*(temp - 32);
		return newNum;

	}
	// Method that converts Celsius to Fahrenheit
	public double CtoF(double temp)
	{
		double newNum;
		newNum = (9/5.0)*(temp) + 32;
		return newNum;
	}


}