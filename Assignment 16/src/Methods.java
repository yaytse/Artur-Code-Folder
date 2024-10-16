public class Methods{
    private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

    public Methods()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Methods(int a, int b, int c){
        sideA = a;
        sideB = b;
        sideC = c;

	}


	public void setSides(int a, int b, int c){
        sideA = a;
        sideB = b;
        sideC = c;
	}

	public void calcPerimeter( ){
		perimeter = sideA + sideB + sideC;

	}

	public void calcArea( ){
		double s = perimeter / 2;;
	}


	public void print( )
	{
        System.out.println((int)a + " " + (int)b + " " + (int)c);
        System.out.printf("Area == " + "%.5f", area);

		System.out.println("\n\n");
	}
}