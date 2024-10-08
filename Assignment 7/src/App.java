//Assignment #7
//Artur Mararash
//09/20/2024

public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        int index1 = message1.indexOf(target1);
        int lenght1 = target1.length();
        String final1 = message1.substring(0, index1-1) + message1.substring(index1 + lenght1);
        System.out.println(final1);


        String message2 = "That was great - lol."                                                                                                                                                                                                                                                                                            ;
        String target2 = "lol";
        int index2 = message2.indexOf(target2);
        String final2 = message2.substring(0, index2) + "laugh out loud.";
        System.out.println(final2);
    }
}
