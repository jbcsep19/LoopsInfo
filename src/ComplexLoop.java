import java.util.Scanner;

public class ComplexLoop {
    // Ask the user for the weather "What's the weather like?"
    // Display their input "Today is ***!"
    // Continue until they say "no"


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rep = "";
        String temp = "";

        // Using do-while loop
        do {
            System.out.println("What's the weather like?");
            temp = sc.nextLine();
            System.out.println("Today is " + temp + "!");

            System.out.println("Would you like to replay?");
            rep = sc.nextLine();
        }while (!rep.equals("no"));


        // Using while loop
        while (!rep.equals("no")){
            System.out.println("What's the weather like?");
            temp = sc.nextLine();
            System.out.println("Today is " + temp + "!");

            System.out.println("Would you like to replay?");
            rep = sc.nextLine();
        }
    }
}
