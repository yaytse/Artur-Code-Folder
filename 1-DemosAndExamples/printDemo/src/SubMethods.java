public class SubMethods {
    private double answer = 0; 

    public void calc(int a, int b){
        answer = (a * b)/1.34;
    }
    public void output(){
        System.out.println(answer);
        System.out.printf("%-8.3f", answer);
        /*
         * %f real/decimal number
         * %d integer
         * %c character value
         * %s string value
         */
    }
}
