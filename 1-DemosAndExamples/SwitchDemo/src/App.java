import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int option = 0;

        System.out.println("Please slect a number: ");
        option = inp.nextInt();
/*
        if (option ==7){
            System.out.println("You selected 7");
        }
        else if (option ==8){
            System.out.println("You selected 8");
        }
        else if (option ==6){
            System.out.println("You selected 6");
        }
        else{
            System.out.println("You selected idk");
        }*/
        switch(option){
            case 7:
            System.out.println("You selected 7");
            break;
            case 8:
            System.out.println("You selected 8");
            break;
            case 9:
            System.out.println("You selected 9");
            break;
        }
    }
}
