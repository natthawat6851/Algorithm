import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter your number2: ");
        int number2 = input.nextInt();

        System.out.println("Current -> number1 = "+number1+" and number 2 = "+number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Swapping");
        System.out.println("now -> number1 = "+number1+" and number 2 = "+number2);

    }
}
