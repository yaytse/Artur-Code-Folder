import java.util.Scanner;

public class Methods {
    Scanner input = new Scanner(System.in);
    public void userinput1(){
        
        double lenght, width; 
        System.out.print("Please input the lenght of a ractangle: ");
        lenght = input.nextDouble();
        System.out.print("Please input the width of a ractangle: ");
        width = input.nextDouble();
        System.out.println(PerimeterOfR(lenght, width));
    }
    public double PerimeterOfR(double lenght, double width){
		return 2*(lenght + width);

	}
	// Method that converts Celsius to Fahrenheit
	public double SurfaceOfCube(double side){
		return 6*side*side;
    }

    public double AreaofCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
/*Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
Surface area of a  Cube.  Formula: SA = 6s2
Area of a Circle. Formula: A = πr2 or A = Pi * r2 */