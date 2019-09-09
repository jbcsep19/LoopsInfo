import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        // Prompt:
        // step 1. print 1 to 5
        // step 2. print 5 numbers inputted by user
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        // for loop - count-controlled
        // initialization; condition; change
        System.out.println("Using for loop");
        for (int i=0; i < 5; i++){
            System.out.println(i+1); // add 1 b/c i starts at zero
        }

        System.out.println("Using for loop - step 2");
        for (int j=0; j < 5; j++){
            System.out.println("Enter an integer: ");
            temp = sc.nextInt();
            System.out.println(temp);
        }

        // while loop - condition-controlled
        // while loop is a pre-test
        System.out.println("Using while loop");
        int i = 0;
        while (i < 5){
            System.out.println(i+1);
            i++;
        }

        System.out.println("Using while loop - step 2");
        int j = 0;
        while (j < 5){
            System.out.println("Enter an integer: ");
            temp = sc.nextInt();
            System.out.println(temp);
            j++;
        }


        // do-while loop - condition-controlled
        // do-while loop is a post-test
        System.out.println("Using do-while loop");
        i = 0;
        do {
            System.out.println(i+1);
            i++;
        } while(i < 5);

        System.out.println("Using do-while loop step 2");
        j = 0;
        do {
            System.out.println("Enter an integer: ");
            temp = sc.nextInt();
            System.out.println(temp);
            j++;
        } while (j < 5);


    }

}
