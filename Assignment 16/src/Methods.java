public class Methods{
    private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;


	public Methods(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
	}

	public void calcPerimeter( ){
		perimeter = sideA + sideB + sideC;
	}

	public void calcArea( ){
		 double s = perimeter / 2;
		 theArea = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));
	}

	public void print( ){
        System.out.println("\n"+(int)sideA + " " + (int)sideB + " " + (int)sideC);
        System.out.printf("Area == " + "%.5f", theArea);
	}
}