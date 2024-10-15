import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Arithmetic Calculator\n");
        System.out.println("Please enter first number: ");
        int first = input.nextInt();
        System.out.println("Now, please enter second number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition: " + add);
        System.out.println("subtraction: " + sub);
        System.out.println("mul is: " + mul);
        System.out.println("div is: " + div);
        System.out.println("mod: " + mod);
    }
}
