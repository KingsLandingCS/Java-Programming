import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Enter a number: ");
//        int value = scanner.nextInt();
//        while (value != 5) {
//            System.out.println("Enter a number: ");
//            value = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);

        int val = 0;  // variable is declared here
        do {
            System.out.println("Enter a number: ");
            val = scanner.nextInt(); // but the value of the variable will get mutated here
        }
        while (val != 5);
        System.out.println("Got 5!");
    }
}
