public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("4 double is " + numDouble(4));
        System.out.println("8 double is " + numDouble(8));

        System.out.println("34094934 double is " + numDouble(80349034));

        System.out.println("0 double is " + numDouble(0));

    }

    public static int numDouble(int num){
        return num*2;
    }
}
