import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);
        // Output the prompt
        System.out.println("Enter a floating point value: ");
        // wait for the user to enter a line of text
        double value = input.nextDouble();
        // Tell them what they entered
        System.out.println("You entered: " + value);
    }
}