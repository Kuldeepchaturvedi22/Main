import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose the operation (1 for Addition, 2 for Subtraction, 3 for Multiplication): ");
        int operation = scanner.nextInt();

        double result = 0;
        
        switch(operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            default:
                System.out.println("Invalid operation choice!");
                break;
        }
        
        scanner.close();
    }
}
