import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcu calcu = new Calcu();

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");

        // Read the user's choice
        int choice = scanner.nextInt();

        // Read the two numbers for the operation
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation
        switch (choice) {
case 1:
                System.out.println("Result: " + calcu.add((int) num1, (int) num2));
                break;
case 2:
                System.out.println("Result: " + calcu.subtract((int) num1, (int) num2));
                break;
case 3:
                System.out.println("Result: " + calcu.multiply((int) num1, (int) num2));
                break;