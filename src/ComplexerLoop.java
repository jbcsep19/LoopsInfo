import java.util.Scanner;

public class ComplexerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rep="";
        while (!rep.equals("quit")){
            System.out.println("Press any key to continue " +
                    "or 'quit' to exit");

            System.out.println("Choose your favorite season");

            rep = sc.nextLine();

            if (rep.equals("fall")||
                rep.equals("summer")||
                rep.equals("winter")||
                rep.equals("spring")){
                System.out.println("Great choice, I like " + rep + " too!");
            } else {
                System.out.println("What planet are you from? Bad input!");
                break;
            }
        }
    }
}
