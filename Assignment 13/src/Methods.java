import java.util.Scanner;

public class Methods {
    Scanner input = new Scanner(System.in);
    //Method if user inputs '1' as an option
    public void userinput1(){
        double lenght = -1, width = -1; //varibales we need
        
        while (lenght <0 && width <0){
            System.out.print("Please input the lenght of a side greater than 0: ");
            String input1 = input.nextLine();  
            System.out.print("Please input the width of a side greater than 0: ");
            String input2 = input.nextLine();  

            try {
                lenght = Double.valueOf(input1);
                width = Double.valueOf(input2);

                if(lenght < 0  || width < 0){
                    continue;
                }
                else{
                System.out.printf("The perimeter of a rectangle is " + "%.2f", PerimeterOfR(lenght, width)); //printing the result that another method returns
 
            }
                }
            catch (NumberFormatException ex){
                System.out.println("Please make sure that both of your varibales are not string and greater than 0");
                lenght = -1;
            }}
    

    }
    //Method if user inputs '2' as an option
    public void userinput2(){
        double side = -1; //varibales we need
        while (side <0){
            System.out.print("Please input the lenght of a side greater than 0: ");
            String input1 = input.nextLine();  
            try {
                side = Double.valueOf(input1);
                if(side <0 ){
                    continue;
                }
                else{
                System.out.printf("The surface of a cube is " + "%.2f", SurfaceOfCube(side));//printing the result that another method returns
            }
                }
            catch (NumberFormatException ex){
                System.out.println("Please input an integr greater than 0");
                side = -1;
            }
        
    } 
    }
    //Method if user inputs '2' as an option
    public void userinput3(){
        double radius = -1; //varibales we need
        while (radius < 0){
            System.out.print("Please input the radius of a circle that is greater than 0: ");
            String input1 = input.nextLine();  
            try {
                radius = Double.valueOf(input1);
                if(radius <0 ){
                    continue;
                }
                else{
                    //printing the result that another method returns
                    System.out.printf("The area of a cirle is " + "%.2f", AreaofCircle(radius)); 
                }
                }
            catch (NumberFormatException ex){
                System.out.println("Please input an integr greater than 0");
                radius = -1;
            }}
    }
    //method for calculating a perimeter of a rectangle
    public double PerimeterOfR(double lenght, double width){
		return 2*(Math.abs(lenght) + Math.abs(width));

	}
	// method for calculating a surface of a cube
	public double SurfaceOfCube(double side){
		return 6*side*side;
    }
    // methods for calculating an area of a circle
    public double AreaofCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
/*Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
Surface area of a  Cube.  Formula: SA = 6s2
Area of a Circle. Formula: A = πr2 or A = Pi * r2 */