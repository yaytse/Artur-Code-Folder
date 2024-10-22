public class Methods {
    private int distance, hours, minutes;
	private double mph;


	public Methods(int dist, int hrs, int mins){ //sets all the numbers
        distance = dist;
        hours = hrs;
        minutes = mins;
	}

    public void MPH(){
        double hours_total = hours + (double)minutes/60; //calculates totla hours
        mph = Math.round((double)distance/(double)hours_total); //calculates speed
	}

	public void print(){
        System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + (int)mph + " MPH."); //displays the final sentence
	}
}
