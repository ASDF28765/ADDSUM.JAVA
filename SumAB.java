import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        // Welcoming Message
        System.out.println("Welcome to Sum");

        // User Input from Scanner Object;
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int A = scnr.nextInt();
            System.out.print("Enter another Number: ");
            int B = scnr.nextInt();
            int Sum = A + B;
            System.out.println("The sum is " + Sum + ".");
        }

    }

}
