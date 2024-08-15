
import java.util.InputMismatchException;
import java.util.Scanner;

public class calci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        while (true) {
            try {
                System.out.print("Enter the 1st number :");
                number1 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid number");
                scanner.next();

            }
        }
        while (true) {
            try {
                System.out.print("Enter the 2nd number: ");
                number2 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid number");
                scanner.nextLine();

            }
        }

        System.out.println(
                "What operation do you want to proform \n 1 sum \n 2 sub \n 3 mal \n 4 div \n Select ut option: ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.printf("%f + %f = %f ", number1, number2, number1 + number2);
                break;
            case 2:
                System.out.printf("%f - %f = %f ", number1, number2, number1 - number2);
                break;
            case 3:
                System.out.printf("%f * %f = %f ", number1, number2, number1 * number2);
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.printf("%f / %f = %f ", number1, number2, number1 / number2);
                }
                break;

            default:
                System.out.printf("%s is not a supported operation \n", operation);
        }

        scanner.close();
    }

}